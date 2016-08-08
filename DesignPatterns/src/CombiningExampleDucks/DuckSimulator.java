package CombiningExampleDucks;


public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();

    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable callDuck = new CallDuck();
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(callDuck);
        simulate(rubberDuck);
        simulate(goose);
    }
    private void simulate(Quackable duck){
        duck.quack();
    }
}
