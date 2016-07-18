package FactoryExamplePizzaSimpleFactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza1 = store.orderPizza("Cheese");
        System.out.println("We ordered a " + pizza1.getName() + "\n");

        System.out.println("--------------------------------------");

        pizza1 = store.orderPizza("Veggie");
        System.out.println("We ordered a " + pizza1.getName() + "\n");

    }
}
