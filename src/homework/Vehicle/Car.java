package homework.Vehicle;

public class Car extends Vehicle {
    public Car(int x, int y, int price, int yearOfMade) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.driveBehavior = new DriveFast();
        this.flyBehavior = new NONFly();
        this.swimBehavior = new NONSwim();
        this.yearOfMade = yearOfMade;
    }

    @Override
    public void performFly(int height, int speed) {
        flyBehavior.fly(height,speed);
    }

    @Override
    public void performDrive(int speed) {
        driveBehavior.drive(speed);

    }

    @Override
    public void performSwim(int speed, int dive) {
        swimBehavior.swim(speed,dive);
    }
}
