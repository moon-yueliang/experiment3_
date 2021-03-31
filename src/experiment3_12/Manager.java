package experiment3_12;

public class Manager {

     private Manager() {

     }

     //静态内部类
    private static class HolderClass {
        private final static Manager instance = new Manager();
    }
    public static Manager getInstance() {
        return HolderClass.instance;
    }


    private Sound sound1 = new Sound();
    private Scene scene1 = new Scene();
    private Role role1 = new Role();

    public void method() {
        sound1.sound();
        scene1.scene();
        role1.role();
    }

}
