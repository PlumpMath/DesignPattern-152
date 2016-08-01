package CommandExample;

/**
 *
 * No command class
 * If our RemoteControl class has a no object inside his array ,
 * we use this class to do empty execute method.
 */

public class NoCommand implements Command {


    @Override
    public void execute() {

    }
    public void undo(){

    }
}
