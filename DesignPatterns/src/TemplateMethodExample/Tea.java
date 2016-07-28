package TemplateMethodExample;

/**
 * Created by Тимур on 28.07.2016.
 */
public class Tea {

    public void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("Boiling the water");
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    private void pourInCup() {
        System.out.println("Pouring into a cup");
    }

    private void addLemon() {
        System.out.println("Adding a lemon");
    }
}
