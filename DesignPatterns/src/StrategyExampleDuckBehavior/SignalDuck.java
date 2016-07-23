package StrategyExampleDuckBehavior;

class SignalDuck extends Duck{


    public SignalDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("I'm a man who hunt on ducksArray");
    }

}
