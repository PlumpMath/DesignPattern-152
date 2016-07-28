package TemplateMethodExample;

/**
 * Created by Тимур on 28.07.2016.
 */
public abstract class Bevarage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
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
