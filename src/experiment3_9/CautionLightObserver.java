package experiment3_9;

public class CautionLightObserver implements Observer {
    private CautionLight cautionLight = new CautionLight();
    @Override
    public void warn() {
      cautionLight.flicker();
    }
}
