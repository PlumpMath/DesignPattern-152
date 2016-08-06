package Class2Work0608;
/**
 * A simple Java Hello World program, in the tradition of
 * Kernighan and Ritchie.
 */
public class LoggingExample1 {
    public static void main(String[] args) {
        LoggingExample1 hello = new LoggingExample1("Hello world!");
        hello.sayHello();
    }

    private String theMessage;

    public LoggingExample1(String message) {
        theMessage = message;
    }

    public void sayHello() {
        System.err.println(theMessage);
    }
}