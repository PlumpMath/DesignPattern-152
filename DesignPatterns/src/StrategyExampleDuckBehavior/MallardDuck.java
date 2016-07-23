package StrategyExampleDuckBehavior;

class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("MallardDuck : quack and fly");
    }
}
