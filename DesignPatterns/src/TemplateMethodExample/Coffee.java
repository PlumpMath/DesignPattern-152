package TemplateMethodExample;


public class Coffee {

    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }

    private void pourInCup() {
        System.out.println("Pouring into the cup");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping coffee through filter");
    }

    private void boilWater() {
        System.out.println("Boiling the water");
    }


}

