package experiment3_6_;

public class LightOffCommand extends LightCommand {
    private Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    public void execute() {
        light.off();
    }
}
