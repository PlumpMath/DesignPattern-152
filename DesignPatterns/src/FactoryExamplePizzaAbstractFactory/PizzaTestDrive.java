package FactoryExamplePizzaAbstractFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoPizza = new ChicagoPizzaStore();

        System.out.println("test NY ----------------------------------------");

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("Veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");


        System.out.println("Test chicago ------------------------------------------");

        pizza = chicagoPizza.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoPizza.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoPizza.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoPizza.orderPizza("Veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

    }
}
