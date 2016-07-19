package homework.Vehicle;


public class Plane extends Vehicle{

    FlyBehavior flyBehavior;


    public Plane(int x, int y, int price, int yearOfMade){
        this.x = x;
        this.y = y;
        this.price = price;
        this.flyBehavior = new FlyRocketPowered();
        this.swimBehavior = new NONSwim();
        this.driveBehavior = new NONDrive();
        this.yearOfMade = yearOfMade;

    }


    public void setPassengers(int passengers){

        this.passengers = passengers;
    }

    public int getPassengers(int passengers){
        return this.passengers;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void performfly(int heigth , int speed) {
        flyBehavior.fly(heigth,speed);
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
