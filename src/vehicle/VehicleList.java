package vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VehicleList {

    Vehicle [] arrVehicle;
    int countVehicle;

    public VehicleList(int countVehicle) {
        arrVehicle = new Vehicle[countVehicle];
        this.countVehicle = 0;
    }

    public VehicleList() throws FileNotFoundException{
        Scanner sc= new Scanner(new File(""));
        arrVehicle = new Vehicle[sc.nextInt()];
        for (int i = 0; i < arrVehicle.length; i++) {
            if (sc.next().equalsIgnoreCase("AmphibianCar")){
                this.setArrVehicle(new AmphibianCar(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()))
            }
        }
    }




}
