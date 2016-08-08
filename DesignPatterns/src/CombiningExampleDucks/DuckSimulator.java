package CombiningExampleDucks;


public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();

    }

    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable callDuck = new QuackCounter(new CallDuck());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable goose = new QuackCounter(new GooseAdapter(new Goose()));

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(callDuck);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println(QuackCounter.getQuacks());
    }
    private void simulate(Quackable duck){
        duck.quack();
    }
}
