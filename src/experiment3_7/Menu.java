package experiment3_7;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItemList = new ArrayList();
    public void addMenuItem(MenuItem menuItem){
        menuItemList.add(menuItem);
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;

    }

}
