package IteratorExample;


public class DinnerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem [] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("KanbB's pancake breakfast", "eggs and toast", true, 2.99);
        addItem("Regular breakfast", "eggs and sausage", false, 2.99);
        addItem("Blueberry pancakes", "blueberry", true, 3.49);
        addItem("Waffles", "waffles on your choice", true, 3.59);
    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(price,name,description,isVegetarian);
        if (numberOfItems >= MAX_ITEMS){
            System.err.println("Sorry, menu is full");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }

}
