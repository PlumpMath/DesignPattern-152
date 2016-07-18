package FactoryExamplePIZZAFactory;

public class MainFactoryTest {


    public static void main(String[] args) {

        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        PizzaStore californiaStore = new CaliforniaStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Tim ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ann ordered a " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("Veggie");
        System.out.println("Some guy ordered a " + pizza.getName() + "\n");

    }
}
