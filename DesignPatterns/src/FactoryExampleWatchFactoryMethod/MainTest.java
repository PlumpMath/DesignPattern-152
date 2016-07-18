package FactoryExampleWatchFactoryMethod;

public class MainTest {
    public static void main(String[] args) {
        WatchFactory factory = getWatch("Roman");
        Watch watch = factory.createWatch();
        watch.showTime();


    }

    public static WatchFactory getWatch(String watch){

        if(watch.equalsIgnoreCase("Roman")){
            return new RomanWatchFactory();
        }else if(watch.equalsIgnoreCase("digital")){
            return new DigitalWatchFactory();
        }
        return null;
    }
}
