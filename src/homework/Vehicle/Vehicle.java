package homework.Vehicle;

public abstract class Vehicle {
    int passengers;
    int yearOfMade;
    int x;
    int y;
    int price;
    int speed;


    FlyBehavior flyBehavior;
    DriveBehavior driveBehavior;
    SwimBehavior swimBehavior;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public int getPrice() {
        return this.price;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }

    public abstract void performfly(int height, int speed) ;

    public abstract void performDrive(int speed) ;

    public abstract void performSwim(int speed, int dive);

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void setDriveBehavior(DriveBehavior driveBehavior){
        this.driveBehavior = driveBehavior;
    }

}
