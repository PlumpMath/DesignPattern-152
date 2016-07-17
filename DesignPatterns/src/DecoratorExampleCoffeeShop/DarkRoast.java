package DecoratorExampleCoffeeShop;

public class DarkRoast extends Beverage {

   public DarkRoast(){
       description = "Dark Roast "+this.getCoffeeSize().ordinal();
   }


    @Override
    public double cost() {
        return 0.99;
    }
}
