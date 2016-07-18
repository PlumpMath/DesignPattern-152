package FactoryExamplePizzaAbstractFactory;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if(item.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }else if(item.equalsIgnoreCase("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }else if(item.equalsIgnoreCase("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }else if(item.equalsIgnoreCase("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
