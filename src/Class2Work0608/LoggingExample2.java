package Class2Work0608;
import java.util.logging.Logger;
/**
 * A simple Java Hello World program, in the tradition of
 * Kernighan and Ritchie.
 */
public class LoggingExample2 {
    private static Logger theLogger =
            Logger.getLogger(LoggingExample2.class.getName());

    public static void main(String[] args) {
        LoggingExample2 hello = new LoggingExample2("Hello world!");
        hello.sayHello();
    }

    private String theMessage;

    public LoggingExample2(String message) {
        theMessage = message;
    }

    public void sayHello() {
        System.err.println(theMessage);
    }
}
