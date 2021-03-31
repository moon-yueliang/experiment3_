package experiment3_11;

public class DTAdapter extends DataHandle{
  private DT dt;

  public DTAdapter(DT dt){
      this.dt = dt;
  }


    @Override
    public void transfer() {
       dt.dt();
    }
}
