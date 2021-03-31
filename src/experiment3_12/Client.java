package experiment3_12;

public class Client {
    public static void main(String[] args){
        Manager manager1,manager2;
        manager1 = Manager.getInstance();
        manager2 = Manager.getInstance();
        System.out.println(manager1==manager2);

        manager1.method();
    }
}
