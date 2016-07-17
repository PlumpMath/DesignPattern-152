package StrategyExampleDuckBehavior;

public class StrategyExample1 {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        duck.performQuack();
        duck.performfly();
        duck.display();

        Duck duck1 = new ModelDuck();
        duck1.performfly();
        duck1.setFlyBehavior(new FlyRocketPowered());
        duck1.performfly();

        DuckSignal notADuck = new DuckSignal();
        notADuck.display();
        notADuck.performQuack();
    }
}




