package experiment3_9;

public class Client {
    public static void main(String[] args) {
        Observer cautionLightObserver = new CautionLightObserver();
        Observer annunciatorObserver = new AnnunciatorObserver();
        Observer insulateDoorObserver = new InsulateDoorObserver();
        Observer securityDoorObserver = new SecurityDoorObserver();

        Thermosensor thermosensor = new Thermosensor();
        thermosensor.attach(cautionLightObserver);
        thermosensor.attach(annunciatorObserver);
        thermosensor.attach(insulateDoorObserver);
        thermosensor.attach(securityDoorObserver);
        thermosensor.notify1();

    }
}