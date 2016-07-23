package StrategyExampleDuckBehavior;

class SignalDuck extends Duck{


    public SignalDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("Signal duck : NoFly, Quack");
    }

}
