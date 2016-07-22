package homework.Vehicle;

public class Batmobile extends Vehicle{

    public Batmobile(int x, int y, int price, int yearOfMade){

         this.x = x;
         this.y = y;
         this.price = price;
         this.driveBehavior = new DriveFast();
         this.flyBehavior = new FlyRocketPowered();
         this.swimBehavior = new SwimDive();
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
