package experiment3_11;

public class KNNAdapter extends DataHandle {
    private KNN knn;

    public KNNAdapter(KNN knn){
        this.knn = knn;
    }

    @Override
    public void transfer() {
        knn.knn();
    }
}
