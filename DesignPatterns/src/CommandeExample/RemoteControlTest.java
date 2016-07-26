package CommandeExample;


public class RemoteControlTest {

    public static void main(String[] args) {

        RemoteControl remote = new RemoteControl();

        //the light
        Light light = new Light("Kitchen light");
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        //the door
        GarageDoor garageDoor = new GarageDoor("House garage");
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);

        //the light
        remote.setCommand(0,lightOn, lightOff);
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        //the garage door
        remote.setCommand(1,garageOpen,garageClose);
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.undoButtonWasPushed();
        remote.undoCommand.execute();


        System.out.println("-------\n");
        System.out.println(remote);
        System.out.println("-------\n");

    }
}
