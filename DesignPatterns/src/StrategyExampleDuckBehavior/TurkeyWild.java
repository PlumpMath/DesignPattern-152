package StrategyExampleDuckBehavior;

public class TurkeyWild implements Turkey{

    @Override
    public void gobble() {
        System.out.println("Gobble , Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am fly but on the short distance");
    }
}
