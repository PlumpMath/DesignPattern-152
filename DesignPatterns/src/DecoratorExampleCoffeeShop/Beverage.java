package DecoratorExampleCoffeeShop;

public abstract class Beverage {
    String description = "Default Beverage";


    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
