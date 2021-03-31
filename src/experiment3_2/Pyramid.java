package experiment3_2;

public class Pyramid extends Component {
    private String name;
    public Pyramid(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void color() {
        System.out.println("对图形"+name+"进行染色");
    }

    @Override
    public void add(Component component) {
        System.out.println("不支持该方法");
    }

    @Override
    public void remove(Component component) {
        System.out.println("不支持该方法");
    }
}
