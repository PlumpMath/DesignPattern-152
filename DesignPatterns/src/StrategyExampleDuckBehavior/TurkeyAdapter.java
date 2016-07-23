package StrategyExampleDuckBehavior;

public class TurkeyAdapter extends Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void performfly() {
        turkey.fly();
    }

    @Override
    public void performQuack() {
        turkey.gobble();
    }

    @Override
    public void display() {
        System.out.println("TurkeyAdapter");
    }




}
