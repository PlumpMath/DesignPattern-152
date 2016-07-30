package QUIZ.Syntax;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
//
//        try{
//            FileInputStream fis = new FileInputStream("outstream");
//            InputStreamReader isr = new InputStreamReader(fis);
//            BufferedReader br = new BufferedReader(isr);
//            try {
//                do {
//                    String str = br.readLine();
//                    System.out.println(str);
//                }while(str !=null);
//            }
//            finally {
//                fis.close();
//                isr.close();
//                br.close();
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
/**
 Ошибка компиляции произойдёт из-за того, что переменная str объявлена внутри цикла do.. while().
 Объявлять переменные в цикле, конечно же, разрешается. Только и использоваться они должны внутри тела цикла.
 А в этом примере переменная str используется за пределами блока
 , в котором она была объявлена - в условии продолжения цикла.
 */