package FactoryExamplePizzaAbstractFactory;

public class NYPizzaStore extends PizzaStore{



    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngridientFactory ingridientFactory = new NYIngridientFactory();



        return pizza;
    }
}
