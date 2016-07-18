package FactoryExamplePizzaAbstractFactory;

public class NYPizzaStore extends PizzaStore{



    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingridientFactory = new NYPizzaIngredientFactory();



        return pizza;
    }
}
