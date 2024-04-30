package cafe;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import cafe.MenuItem;
public class Menu{
    private ArrayList<MenuItem> menuItemList;
    private String type;
    private DailySpecials dailySpecials;
    public Menu(ArrayList<MenuItem> menuItemList, DailySpecials dailySpecials) {
        this.menuItemList = menuItemList;
      this.dailySpecials = dailySpecials;
        this.type = "Regular";
    }

    public void addMenuItem(MenuItem item) {
        menuItemList.add(item);
    }

  public MenuItem findMenuItemByName(String name) {
  for (MenuItem item : menuItemList) {
          if (item.getItemName().equalsIgnoreCase(name)) {
              return item;
          }
      }
      // Check if the item is a daily special
      for (List<MenuItem> specials : dailySpecials.getSpecialsBasedOnDay().values()) {
          for (MenuItem item : specials) {
              if (item.getItemName().equalsIgnoreCase(name)) {
                  return item;
              }
          }
      }
      return null; // Item not found
  }
    public void removeMenuItem(MenuItem item) {
        menuItemList.remove(item);
    }

    public void updateMenuItem(MenuItem item) {
        // Implementation for updating menu item
    }
}
