package CommandExample;

/**
 * Created by Тимур on 26.07.2016.
 */
public class Stereo  {


    String location ;
    int volume = 10;

    public Stereo(String location) {
        this.location = location;
    }
    public void on(){
        System.out.println(location+ " stereo is on" );
    }
    public void off(){
        System.out.println(location+" stereo is off");
    }
    public void setCD(){
        System.out.println(location + " stereo is set for CD input");
    }
    public void setDVD(){
        System.out.println(location + " stereo is set for DVD input");
    }
    public void setRadio(){
        System.out.println(location + " stereo is set for radio");
    }
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println(location + " stereo volume set to " + volume);
    }
}
