package experiment3_8;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        Observer observer3 = new Observer3();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);
        subject.notify1();
    }
}