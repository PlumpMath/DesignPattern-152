package CommandExample;




public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }


    public void setCommand(int slot, Command onCommand, Command offComand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offComand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote control --------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot "+i+ "] " + onCommands[i].getClass().getName()
                        + "   " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuffer.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuffer.toString();
    }
}
