package homework.Vehicle;

public class NONFly implements FlyBehavior {
    @Override
    public void fly(int height, int speed) {
        System.out.println("This object can not fly");
    }
}
