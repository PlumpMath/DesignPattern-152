package homework.Vehicle;

class FlyRocketPowered implements FlyBehavior{
    public void fly(int h, int s) {
        System.out.println("ROCKET FLY , your current speed and height = ");
        int speed=0;
        for (int i = 0,j=0; j < h; i+=(int)Math.pow(++i,1.03),j=(int)Math.pow(++j,1.3)) {
            System.out.println("Speed = " +i+" height =" +j);
            speed = i;
        }
        System.out.println("Height is "+ h+", your current speed is "+ speed);
    }
}
