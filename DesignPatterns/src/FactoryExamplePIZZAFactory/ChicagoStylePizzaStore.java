package FactoryExamplePIZZAFactory;

public class ChicagoStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {

        if(type.equalsIgnoreCase("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if(type.equalsIgnoreCase("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        } else if(type.equalsIgnoreCase("clam")){
            return new ChicagoStyleClamPizza();
        } else if(type.equalsIgnoreCase("veggie")){
            return new ChicagoStyleVeggiePizza();
        }else return null;
    }
}
