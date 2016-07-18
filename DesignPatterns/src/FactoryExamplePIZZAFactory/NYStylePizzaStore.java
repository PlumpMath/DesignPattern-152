package FactoryExamplePIZZAFactory;

public class NYStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {

        if(type.equalsIgnoreCase("cheese")) {
            return new NYStyleCheesePizza();
        } else if(type.equalsIgnoreCase("pepperoni")){
            return new NYStylePepperoniPizza();
        } else if(type.equalsIgnoreCase("clam")){
            return new NYStyleClamPizza();
        } else if(type.equalsIgnoreCase("veggie")) {
            return new NYStyleVeggiePizza();
        }else return null;

    }
}
