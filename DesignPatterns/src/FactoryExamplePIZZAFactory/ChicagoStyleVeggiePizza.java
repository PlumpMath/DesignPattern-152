package FactoryExamplePIZZAFactory;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago style veggie pizza";
        dough = "Tasty dough";
        sauce = "Marinara sauce";

        toppings.add("NO MEAT, extra vegetables");
    }
}

