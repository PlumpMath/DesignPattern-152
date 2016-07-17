package StrategyExampleDuckBehavior;

class DuckSignal{
    QuackBehavior quackBehavior;
    public DuckSignal(){
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I'm a man who hunt on ducks");
    }

    public void performQuack(){
        quackBehavior.quack();
    }

}
