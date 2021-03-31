package experiment3_8;

import java.util.ArrayList;

public abstract class Subject {

    protected ArrayList<Observer> observers = new ArrayList();
    //注册方法，用于向观察者集合中增加一个观察者
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //注销方法，用于在观察者集合中删除一个观察者
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notify1();


}
