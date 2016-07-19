package homework.Vehicle;

public class DriveFast implements DriveBehavior {
    @Override
    public void drive(int speed) {
        System.out.println("Race speed");
        for (int i = 0; i <= speed; i++) {
            System.out.println(i+" kph");
        }
    }
}
