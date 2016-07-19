package homework.Vehicle;

public class NONDrive implements DriveBehavior {
    @Override
    public void drive(int speed) {
        System.out.println("This object can not drive");
    }
}
