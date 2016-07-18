package FactoryExamplePizzaFactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheezePizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }else if(type.equals("Veggi")){
        }
        return pizza;
    }
}
