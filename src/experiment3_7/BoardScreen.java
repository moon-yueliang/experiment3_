package experiment3_7;

import java.util.List;
public class BoardScreen {
    private Menu menu;
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public BoardScreen() {
        super();
        menu = new Menu();
    }

    public void open(){
        System.out.println("调用open方法");

    }

    public void create(){
        System.out.println("调用create方法");
    }

    public void edit(){
        System.out.println("调用edit方法");
    }

    public void show(){
        //System.out.println("调用show方法");
        Command openCommand,createCommand,editCommand;
        //初始化
        openCommand = new OpenCommand(this);
        createCommand = new CreateCommand(this);
        editCommand = new EditCommand(this);
        //初始化菜单
        MenuItem openMenuItem = new MenuItem("打开");
        openMenuItem.setCommand(openCommand);
        MenuItem createMenuItem = new MenuItem("创建");
        createMenuItem.setCommand(createCommand);
        MenuItem editMenuItem = new MenuItem("编辑");
        editMenuItem.setCommand(editCommand);

        //菜单项加入菜单

        menu.addMenuItem(openMenuItem);
        menu.addMenuItem(createMenuItem);
        menu.addMenuItem(editMenuItem);
        System.out.println("显示界面");
        System.out.println("-------------------------------");
        List<MenuItem> menuItems = menu.getMenuItemList();
        for(MenuItem m:menuItems){
            System.out.println(m.getMenuItemName()+"菜单项被点击");
            m.click();
        }
    }

}
