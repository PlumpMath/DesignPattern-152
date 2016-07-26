package CommandeExample;


import java.util.Arrays;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }


    public void setCommand(int slot, Command onCommand, Command offComand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offComand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote control --------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot "+i+ "] " + onCommands[i].getClass().getName()
                        + "   " + offCommands[i].getClass().getName() + "\n");

        }
        return stringBuffer.toString();
    }
}
