package TemplateMethodExample;



public class Tea extends Bevarage{


    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding a lemon");
    }
}
