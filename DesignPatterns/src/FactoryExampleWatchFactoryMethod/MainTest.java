package FactoryExampleWatchFactoryMethod;

public class MainTest {
    public static void main(String[] args) {
        WatchFactory factory = new RomanWatchFactory();

        Watch watch = factory.createWatch();
        watch.showTime();


    }
}
