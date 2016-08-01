package IteratorExample;


import java.util.*;
import java.util.Iterator;

public class PancakeHouseMenu {


    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("KanbB's pancake breakfast", "eggs and toast", true, 2.99);
        addItem("Regular breakfast", "eggs and sausage", false, 2.99);
        addItem("Blueberry pancakes", "blueberry", true, 3.49);
        addItem("Waffles", "waffles on your choice", true, 3.59);

    }


    public void addItem(String name , String description ,boolean vegeterian,double price){
        MenuItem menuItem = new MenuItem(price,name,description,vegeterian);
        menuItems.add(menuItem);
    }

//    public ArrayList getMenuItems() {
//        return menuItems;
//    }
    public Iterator createIterator(){
        return menuItems.iterator();
    }

    public String toString(){
        return "ObjectVille Pancake House Menu";
    }


    /**
     * другие методы
     *
     *
     *
     */
}
