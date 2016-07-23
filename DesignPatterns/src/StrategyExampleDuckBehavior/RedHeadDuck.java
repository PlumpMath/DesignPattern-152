package StrategyExampleDuckBehavior;

public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Red Head Duck : Fly , Quack");
    }
}
