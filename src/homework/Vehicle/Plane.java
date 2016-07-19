package homework.Vehicle;


public class Plane extends Vehicle{

    FlyBehavior flyBehavior;


    public Plane(int x, int y, int price){
        this.x = x;
        this.y = y;
        this.price = price;
        this.flyBehavior = new FlyRocketPowered();
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
        System.out.println("This object can't drive");
    }
}
