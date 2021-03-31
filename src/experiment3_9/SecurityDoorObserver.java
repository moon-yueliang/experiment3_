package experiment3_9;

public class SecurityDoorObserver implements Observer {
   private SecurityDoor securityDoor = new SecurityDoor();
    @Override
    public void warn() {
securityDoor.open();
    }
}
