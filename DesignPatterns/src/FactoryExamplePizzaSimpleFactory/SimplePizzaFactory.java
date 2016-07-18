package FactoryExamplePizzaSimpleFactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza();
        }else if(type.equalsIgnoreCase("pepperoni")){
            pizza = new PepperoniPizza();
        }else if(type.equalsIgnoreCase("clam")){
            pizza = new ClamPizza();
        }else if(type.equalsIgnoreCase("Veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
