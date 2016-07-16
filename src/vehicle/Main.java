package vehicle;

import java.util.ArrayList;
import java.util.Date;


public class Main {

	public static void main(String[] args) {

		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(new Plane(1100, 1000, 1112221, 10000, new Date(), 1111, 20));
		vehicles.add(new Car(12, 33, 334, 123, new Date()));
		vehicles.add(new Ship(110, 100, 1121, 100, new Date(), 4949, 200));
		
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
}
