package experiment3_9;

public class InsulateDoorObserver implements Observer {
   private InsulatedDoor insulatedDoor = new InsulatedDoor();
    @Override
    public void warn() {
     insulatedDoor.close();
    }
}
