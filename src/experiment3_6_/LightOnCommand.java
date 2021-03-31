package experiment3_6_;

public class LightOnCommand extends LightCommand{
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}
