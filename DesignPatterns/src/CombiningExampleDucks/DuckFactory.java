package CombiningExampleDucks;


public class DuckFactory extends AbstractDuckFactory{



    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createCallDuck() {
        return new CallDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
