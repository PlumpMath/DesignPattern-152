package FactoryExamplePizzaAbstractFactory;

public interface PizzaIngridientFactory {


    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();


}
