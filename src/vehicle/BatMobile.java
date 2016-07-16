package vehicle;

import java.util.Date;

public class BatMobile extends Vehicle implements Driveable,Swimable,Flyable {

    public BatMobile(int x , int y ,int price, int speed, Date date){
        super(x,y,price,speed,date);

    }


    @Override
    int getX() {
        return x;
    }

    @Override
    void setX(int x) {
    this.x = x;
    }

    @Override
    int getY() {
        return y;
    }

    @Override
    void setY(int y) {
        this.y = y;
    }

    @Override
    public void Drive() {
        System.out.println("Batmobile drive");
    }

    @Override
    public void fly() {
        System.out.println("Batmobile fly");
    }

    @Override
    public void swim() {
        System.out.println("Batmobile swim");
    }
}
