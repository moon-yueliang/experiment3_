package experiment3_1;
import java.util.ArrayList;

public class Group extends Component {
    private String name;
    public ArrayList<Component> components = new ArrayList<>();

    public Group(String name){
        this.name = name;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override

    public void add(Component component) {
        components.add(component);
    }
    @Override

    public void remove(Component component) {
        components.remove(component);
    }

    @Override

    public void share(Component component) {
        if (component instanceof Group){
            ArrayList<Component> com = ((Group)component).getComponents();

            for (Component object:components){
                object.share(object);

            }

        }else  if (component instanceof  Member){
            ((Member)component).onMessage();

        }
    }
}