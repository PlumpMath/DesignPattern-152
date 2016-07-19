package homework.Vehicle;

public class Car extends Vehicle {
    public Car(int x, int y, int price) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.driveBehavior = new DriveFast();
    }

    @Override
    public void performfly(int height, int speed) {
        System.out.println("This object can not fly");
    }

    @Override
    public void performDrive(int speed) {
        driveBehavior.drive(speed);

    }
}
