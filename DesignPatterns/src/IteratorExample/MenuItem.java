package IteratorExample;


public class MenuItem extends MenuComponent{
    private double price;
    private String name;
    private String description;
    private boolean isVegeterian;

    public MenuItem(double price, String name, String description, boolean isVegetarian) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.isVegeterian = isVegetarian;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getVegeterian() {
        return isVegeterian;
    }

    public void setVegeterian(boolean vegeterian) {
        isVegeterian = vegeterian;
    }

    @Override
    public void print() {
        System.out.print(" "+ getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(", "+ getPrice());
        System.out.println("      -- " + getDescription());
    }
}
