package homework.Vehicle;

public class Ship extends Vehicle {

    public Ship(int x, int y , int price,int yearOfMade) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.swimBehavior = new SwimOnSurface();
        this.driveBehavior = new NONDrive();
        this.flyBehavior = new NONFly();
        this.yearOfMade = yearOfMade;
    }

    @Override
    public void performfly(int height, int speed) {
        flyBehavior.fly(height,speed);
    }

    @Override
    public void performDrive(int speed) {
        System.out.println("This object can not fly");
        driveBehavior.drive(speed);
    }


    public void performSwim(int speed) {
        swimBehavior.swim(speed,0);
    }


    public void performSwim(int speed, int dive) {
        swimBehavior.swim(speed,dive);
    }
}
