package vehicle;

import java.util.Date;

public class AmphibianCar extends Vehicle implements Swimable, Driveable {


    public AmphibianCar(int x, int y, int price, int speed, Date date) {
        super(x, y, price, speed, date);
    }

    @Override
    int getX() {
        return x;
    }

    @Override
    void setX(int x) {
    this.x=x;
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
        System.out.println("Amphibian move");
    }

    @Override
    public void swim() {
        System.out.println("Amphibian swim");
    }
}
