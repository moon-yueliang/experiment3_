package experiment3_6_;

public class Client {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        System.out.println("-----------电灯1------------");
        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        remoteControl.OnButtonPressed(0);
        remoteControl.OffButtonPressed(0);

        System.out.println("-----------电灯2------------");
        remoteControl.setCommand(1,lightOnCommand,lightOffCommand);
        remoteControl.OnButtonPressed(1);
        remoteControl.OffButtonPressed(1);

        System.out.println("-----------电灯3------------");
        remoteControl.setCommand(2,lightOnCommand,lightOffCommand);
        remoteControl.OnButtonPressed(2);
        remoteControl.OffButtonPressed(2);

        System.out.println("-----------电灯4------------");
        remoteControl.setCommand(3,lightOnCommand,lightOffCommand);
        remoteControl.OnButtonPressed(3);
        remoteControl.OffButtonPressed(3);

        System.out.println("-----------电灯5------------");
        remoteControl.setCommand(4,lightOnCommand,lightOffCommand);
        remoteControl.OnButtonPressed(4);
        remoteControl.OffButtonPressed(4);
    }
}
