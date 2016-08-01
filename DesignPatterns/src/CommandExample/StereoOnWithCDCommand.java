package CommandExample;

/**
 * Created by Тимур on 26.07.2016.
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);

    }

    @Override
    public void undo() {

    }
}
