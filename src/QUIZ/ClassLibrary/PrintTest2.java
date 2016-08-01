package QUIZ.ClassLibrary;


public class PrintTest2 {
    public static void main(String[] args) {
        String d = "beekeeper";
        d.substring(1,7);
        d = "w" + d;
        //d.insert(3, "bee");
        System.out.println(d);
    }
}
/**
 *
 * Класс String является immutable и не содержит метод insert()
 * При изучении классов StringBuffer и StringBuilder обычно акцентируется внимание на их отличиях от String:
 * их содержимое может быть модифицировано с помощью специальных методов - append, insert, delete. Если знать этот факт,
 * то при ответе на вопрос особых затруднений не возникает
 */
