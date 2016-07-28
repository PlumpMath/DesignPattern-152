package TemplateMethodExample;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends Beverage {

    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }
    }
    private String getUserInput(){
        String answer = null;
        System.out.println("Do you want to add a milk and sugar to your coffee(y/n)?");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = reader.readLine();

        }catch (IOException e){
            e.printStackTrace();
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}

