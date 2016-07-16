package StrategyExample1;

class MallarDuck extends Duck{
    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("MallarDuck quack and fly");
    }
}
