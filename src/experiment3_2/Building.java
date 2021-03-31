package experiment3_2;

import java.util.ArrayList;

public class Building extends Component {
    private String name;
    private ArrayList<Component> List = new ArrayList<Component>();

    public Building(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void color() {
      System.out.println("对图形"+name+"染色");
        for (Component object : List) {
            object.color();

        }
    }

    @Override
    public void add(Component component) {
        List.add(component);
    }

    @Override
    public void remove(Component component) {
    List.remove(component);
    }
}