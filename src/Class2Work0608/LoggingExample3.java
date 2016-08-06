package Class2Work0608;
import java.util.logging.Logger;

/**
 * A simple Java Hello World program, in the tradition of
 * Kernighan and Ritchie.
 */
public class LoggingExample3 {
    private static Logger theLogger =
            Logger.getLogger(LoggingExample3.class.getName());

    public static void main(String[] args) {
        LoggingExample3 hello = new LoggingExample3("Hello world!");
        hello.sayHello();
    }

    private String theMessage;

    public LoggingExample3(String message) {
        theMessage = message;
    }

    public void sayHello() {
        // use the 'least important' type of message, one at
        // the 'finest' level.
        theLogger.finest("Hello logging!");
        System.err.println(theMessage);
    }
  /*
SEVERE 	The highest value; intended for extremely important messages (e.g. fatal program errors).
WARNING Intended for warning messages.
INFO 	Informational runtime messages.
CONFIG 	Informational messages about configuration settings/setup.
FINE 	Used for greater detail, when debugging/diagnosing problems.
FINER 	Even greater detail.
FINEST 	The lowest value; greatest detail.
*******
* We used the finest() method of our logger,
* which generates a logging record at the Level.FINEST level.
* By default, only records at the Level.INFO level or higher will be logged to the console,
* so our record wasn't printed.
   */
}