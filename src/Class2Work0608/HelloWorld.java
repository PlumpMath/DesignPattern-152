package Class2Work0608;


import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

    private static Logger theLogger = Logger.getLogger(HelloWorld.class.getName()) ;

    private String theMessage;

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld("hello world");
        theLogger.setLevel(Level.FINEST);
        helloWorld.sayHello();
    }


    public HelloWorld(String theMessage) {
        this.theMessage = theMessage;
    }

    public void sayHello(){
        theLogger.info("Hello loggig!" + theLogger.getLevel());
        System.err.println(theMessage);
    }

}
