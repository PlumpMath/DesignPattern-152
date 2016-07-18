package FactoryExampleWatchFactoryMethod;

public class RomanWatchFactory implements WatchFactory {
    @Override
    public Watch createWatch() {
        return new RomanWatch();
    }
}
