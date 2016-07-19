package homework.Vehicle;

public class NONSwim implements SwimBehavior {
    @Override
    public void swim(int speed, int dive) {
        System.out.println("This object can not swim");
    }
}
