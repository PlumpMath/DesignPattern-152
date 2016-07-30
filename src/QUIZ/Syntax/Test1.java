package QUIZ.Syntax;


public class Test1 {

    public static void main(String[] args) {

        int i = 1;
        i <<= 1;
        System.out.println(i);
        float f =  1;
       // f = f << 1;  //operator << cannot be applied to float,int
        System.out.println(i+ ", " +f);
    }
}
