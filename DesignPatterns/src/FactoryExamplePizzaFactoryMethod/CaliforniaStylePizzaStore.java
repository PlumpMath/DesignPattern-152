package FactoryExamplePizzaFactoryMethod;

public class CaliforniaStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if(type.equalsIgnoreCase("cheese")){
            return new CaliforniaStyleCheesePizza();
        } else if(type.equalsIgnoreCase("pepperoni")){
            return new CaliforniaStylePepperoniPizza();
        } else if(type.equalsIgnoreCase("clam")){
            return new CaliforniaStyleClamPizza();
        } else if(type.equalsIgnoreCase("veggie")){
            return new CaliforniaStyleVeggiePizza();
        }else return null;
    }
}
