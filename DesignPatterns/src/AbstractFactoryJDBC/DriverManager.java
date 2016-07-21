package AbstractFactoryJDBC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DriverManager {

    private static List<Driver> drivers  = new ArrayList<>();

    public synchronized static Connection getConnection(String url){
        for(Driver driver : drivers){
            if(driver.acceptsURL(url)){
                return driver.connect(url);
            }
        }
        throw new RuntimeException();
    }

    public synchronized  static void registerDriver(Driver driver){
        drivers.add(driver);
    }

}

class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        Iterator<Integer> iter = list.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

//        for (Integer k :
//                list) {
//            System.out.println(k);
//        }
    }
}
