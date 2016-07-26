package CommandeExample;

/**
 * Created by Тимур on 26.07.2016.
 */
public class GarageDoor {

    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up(){
        this.lightOn();
        System.out.println("The door is opening");
    }
    public void down(){
        this.lightOff();
        System.out.println("The door is closing");

    }
    public void stop(){
        System.out.println("The door was stooped");
    }
    public void lightOn(){
        System.out.println("Garage door light is on");
    }
    public void lightOff(){
        System.out.println("Garage door light is off");
    }


}
