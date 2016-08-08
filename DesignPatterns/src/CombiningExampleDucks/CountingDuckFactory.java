package CombiningExampleDucks;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());

    }

    @Override
    public Quackable createCallDuck() {
        return new QuackCounter(new CallDuck());

    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());

    }
}
