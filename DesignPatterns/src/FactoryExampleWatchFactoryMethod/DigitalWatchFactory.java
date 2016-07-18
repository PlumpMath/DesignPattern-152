package FactoryExampleWatchFactoryMethod;

public class DigitalWatchFactory implements WatchFactory{
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
