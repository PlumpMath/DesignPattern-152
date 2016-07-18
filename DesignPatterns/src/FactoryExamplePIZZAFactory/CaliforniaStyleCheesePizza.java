package FactoryExamplePIZZAFactory;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        name = "California style cheese pizza";
        dough = "Extra Thick crust dough";
        sauce = " Double Plum tomato sauce";

        toppings.add("Shredded mozzarella cheese");
        toppings.add("Sliced pineapple");
    }

    @Override
    void bake() {
        System.out.println("Bake for 20min at 150 degrees");
    }
}
