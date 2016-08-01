package CommandExample;


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

        //the stereo
        Stereo stereo = new Stereo("Living room");
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        //the ceiling fan
        CeilingFan ceilingFan = new CeilingFan("Living room");
        CeilingFanHighCommand fanOn = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand fanOff = new CeilingFanOffCommand(ceilingFan);


        Command[] partyOn = { lightOn, stereoOn, garageOpen, fanOn};
        Command[] partyOff = { lightOff, stereoOff, garageClose, fanOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remote.setCommand(0, partyOnMacro, partyOffMacro);
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);


        System.out.println("\n ----- \n "+ remote + "----- \n");

    }
}
