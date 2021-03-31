package experiment3_9;

public class AnnunciatorObserver implements Observer {
   private Annunciator annunciator = new Annunciator();
    @Override
    public void warn() {
        annunciator.alarm();
    }
}
