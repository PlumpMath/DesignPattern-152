package TemplateMethodExample;


public class Coffee extends Bevarage{

    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

}

