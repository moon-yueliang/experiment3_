package experiment3_7;

public class MenuItem {
    private String menuItemName;
    private Command command;

    public MenuItem(String menuItemName) {
       // super();
        this.menuItemName = menuItemName;

    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;

    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }

}
