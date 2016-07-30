package QUIZ.ClassLibrary;


public class PrintTest {

    public static void main(String[] args) {
        Boolean f1 = true;
        Boolean f2 = new Boolean("/false");
        String a = "" + 1 + '+' + 1 + '=' + (1+1) + " is ";
        String b = a + f1 + '/' + f2;
        System.out.println(b);    //1+1=2 is true/false
    }
}
