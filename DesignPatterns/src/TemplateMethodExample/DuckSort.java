package TemplateMethodExample;


import java.util.Arrays;

public class DuckSort {

    public static void main(String[] args) {
        Duck[] ducks = {
                        new Duck("duff",9),
                        new Duck("tima",10),
                        new Duck("howard",11),
                        new Duck("huey", 2),
                        new Duck("zoue", 4),
                        new Duck("louie", 8)
        };

        System.out.println("before sorting");
        display(ducks);


        Arrays.sort(ducks);
        System.out.println("After sorting");
        display(ducks);
    }


    public static void display(Duck... ducks){
        for (Duck d : ducks) {
            System.out.println(d);
        }
    }

}
