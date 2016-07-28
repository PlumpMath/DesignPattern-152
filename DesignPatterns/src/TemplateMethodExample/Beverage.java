package TemplateMethodExample;



public abstract class Beverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
            addCondiments();
    }


    public boolean customerWantsCondiments() {
        return true;
    }

    abstract void brew();
    abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling the water");
    }
    public void pourInCup(){
        System.out.println("Pouring into a cup");
    }



}
