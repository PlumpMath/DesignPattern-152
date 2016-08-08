package CombiningExampleDucks;


public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();


        duckSimulator.simulate(duckFactory);

    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable callDuck = duckFactory.createCallDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
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
