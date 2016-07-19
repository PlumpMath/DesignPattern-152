package homework.Vehicle;

public class SwimDive implements SwimBehavior {


    @Override
    public void swim(int speed, int dive) {
        System.out.println("diving...." + dive+" m." +
                " your current speed is "+ speed+ " km/h" );
    }
}
