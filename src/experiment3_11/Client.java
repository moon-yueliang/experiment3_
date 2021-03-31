package experiment3_11;

public class Client {
    public static void main(String[] args){
  DataHandle dataHandle;
  //dataHandle = new DTAdapter(new DT());
//  dataHandle = new KNNAdapter(new KNN());
  dataHandle = new NBAdapter(new NB());
  dataHandle.templateMethod();
    }

}
