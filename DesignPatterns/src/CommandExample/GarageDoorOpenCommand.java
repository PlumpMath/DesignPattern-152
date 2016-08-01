package CommandExample;

/**
 * Created by Тимур on 26.07.2016.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {

    }
}
