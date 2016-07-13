package Delegate;

import java.util.Scanner;

public class DelegateExample2 {

    public static void main(String[] args) {
        System.out.println("Введите программиста");
        Scanner scanner = new Scanner(System.in);
        String programmerType = scanner.nextLine();
        Programmer programmer = new Programmer();

        if(programmerType.equalsIgnoreCase("Java programmer")){
            programmer.programming = new JavaProgramming();
        }else if(programmerType.equalsIgnoreCase("C# programmer")){
            programmer.programming = new CSharpProgramming();
        }else if(programmerType.equalsIgnoreCase("Python programmer")){
            programmer.programming = new PythonProgramming();
         }
        programmer.makeCode();
    }
}



interface Programming{
    void makeCode();
}

class JavaProgramming implements Programming{
    public void makeCode(){
        System.out.println("JavaVirtualMachine, Oracle");
    }
}

class CSharpProgramming implements Programming{
    public void makeCode(){
        System.out.println(".NET, Microsoft");
    }
}
class PythonProgramming implements Programming{
    public void makeCode(){
        System.out.println("Python");
    }
}


class Programmer {
    Programming programming;

    void makeCode(){
        programming.makeCode();
    }
}



