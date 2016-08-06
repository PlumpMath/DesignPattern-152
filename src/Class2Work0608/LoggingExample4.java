package Class2Work0608;
import java.util.logging.Logger;

/**
 * A simple Java Hello World program, in the tradition of
 * Kernighan and Ritchie.
 */
public class LoggingExample4 {
    private static Logger theLogger =
            Logger.getLogger(LoggingExample4.class.getName());

    public static void main(String[] args) {
        LoggingExample4 hello = new LoggingExample4("Hello world!");
        hello.sayHello();
    }

    private String theMessage;

    public LoggingExample4(String message) {
        theMessage = message;
    }

    public void sayHello() {
        theLogger.info("Hello logging!");
        System.err.println(theMessage);
    }
}