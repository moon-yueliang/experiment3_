package experiment3_8;

public class ConcreteSubject extends Subject {
    @Override
    public void notify1() {
        for(Object obs:observers){
            ((Observer)obs).update();
        }
    }
}
