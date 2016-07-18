package FactoryExamplePIZZAFactory;

public class CaliforniaStyleClamPizza extends Pizza {
    public CaliforniaStyleClamPizza() {
        name = "California style clam pizza";
        dough = "Tasty dough";
        sauce = "Marinara sauce";

        toppings.add("Sliced pineapple");
    }
}
