package experiment3_4;

public class Client {
    public static void main(String[] args){
        AbstractFacade abstractfacade;
        abstractfacade = new DataFacade();
       // abstractfacade = new XMLFacade();
        abstractfacade.dataprocess();
    }
}
