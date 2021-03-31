package experiment3_1;
import java.util.ArrayList;
public class Member extends Component {
    private String name;
    public Member(String name){
        this.name=name;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }


    @Override

    public void add(Component component) {
        System.out.println("错误");

    }



    @Override

    public void remove(Component component) {
        System.out.println("错误");

    }

    @Override
    public void share(Component component) {
        if (component instanceof Group){
            ArrayList<Component> components = ((Group)component).getComponents();
            if (components.contains(this)){
                components.remove(this);
            }

            for (Component obj:components){
                obj.share(obj);

            }

            components.add(this);

        }else if (component instanceof Member){
            ((Member)component).onMessage();

        }
    }

    public void onMessage() {
        System.out.println(this.getName()+"收到消息");

    }
}