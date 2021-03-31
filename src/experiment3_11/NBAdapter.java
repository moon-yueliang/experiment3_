package experiment3_11;

public class NBAdapter extends DataHandle{
    private NB nb;

    public NBAdapter(NB nb){
        this.nb = nb;
    }

    @Override
    public void transfer() {
        nb.nb();
    }
}
