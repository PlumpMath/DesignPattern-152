package homework.Vehicle;

public class MainClass {
    public static void main(String[] args) {

        Vehicle plane = new Plane(1,1,1000,1999);
        ((Plane)plane).setPassengers(500);
        plane.performfly(10000, 800);

        System.out.println("\n-----------------------\n");

        Vehicle car = new Car(2,3, 100, 1983);
        car.performDrive(320);

        System.out.println("\n-----------------------\n");

        Vehicle ship = new Ship(4,5,111, 1899);
        ship.performSwim(10,5);
    }
}
