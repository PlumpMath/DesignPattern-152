package TemplateMethodExample;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends Beverage{


    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding a lemon");
    }
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
        System.out.println("Do you want to add a lemon to your tea(y/n)?");

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
