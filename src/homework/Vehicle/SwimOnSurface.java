package homework.Vehicle;

public class SwimOnSurface implements SwimBehavior {
    @Override
    public void swim(int speed,int dive) {

        System.out.println("Your current speed is "+ speed + " , you are on the wave in Pacific Ocean");

    }
}
