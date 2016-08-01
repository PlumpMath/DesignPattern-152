package IteratorExample;


public class MenuItem {
    private int price;
    private String name;
    private String description;
    private boolean isVegeterian;

    public MenuItem(int price, String name, String description, boolean isVegeterian) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.isVegeterian = isVegeterian;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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

    public boolean isVegeterian() {
        return isVegeterian;
    }

    public void setVegeterian(boolean vegeterian) {
        isVegeterian = vegeterian;
    }
}
