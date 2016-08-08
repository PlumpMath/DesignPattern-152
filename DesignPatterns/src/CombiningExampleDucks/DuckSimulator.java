package CombiningExampleDucks;


public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();

    }

    private void simulate() {
        Quackable mallarDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable callDuck = new CallDuck();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("\nDuck Simulator");

        simulate(mallarDuck);
        simulate(redheadDuck);
        simulate(callDuck);
        simulate(redheadDuck);
    }
    private void simulate(Quackable duck){
        duck.quack();
    }
}
