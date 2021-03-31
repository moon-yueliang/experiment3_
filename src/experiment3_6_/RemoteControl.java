package experiment3_6_;

public class RemoteControl {
    private LightCommand[] onCommands;
    private LightCommand[] offCommands;

    public RemoteControl(){
        onCommands = new LightCommand[5];
        offCommands = new LightCommand[5];
    }
    public void setCommand(int slot,LightCommand commandOn,LightCommand commandOff){
        onCommands[slot] = commandOn;
        offCommands[slot] = commandOff;
    }

    public void OnButtonPressed(int slot){
        onCommands[slot].execute();
    }

    public void OffButtonPressed(int slot){
        offCommands[slot].execute();
    }
}
