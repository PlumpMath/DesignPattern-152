package QUIZ.GeneralQuiz;


public class Test2   {
    public static void main(String[] args) {

        String str1 = "string";
        String str2 = "string";
        System.out.println(str1==str2 ? "1.the same " : "1.not the same");

        String str3 = "str";
        String str4 = "ing";
        System.out.println(str1==(str3+str4) ? "2.the same " : "2.not the same");

        String str5 = new String("string");
        System.out.println(str1==str5 ? "3.the same " : "3.not the same");

        String temp = "sun";
        System.out.println("sun".equals(temp) ? "4.the same " : "4.not the same");
        System.out.println(temp.equals("sun") ? "5.the same " : "5.not the same");
    }

}
