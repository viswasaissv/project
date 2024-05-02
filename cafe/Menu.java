package cafe;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import cafe.MenuItem;

 /**
 * The class Menu
 */ 
public class Menu{
    private ArrayList<MenuItem> menuItemList;
    private String type;
    private DailySpecials dailySpecials;

/** 
 *
 * It is a constructor. 
 *
 * @param menuItemList  the menu item list. 
 * @param dailySpecials  the daily specials. 
 */
    public Menu(ArrayList<MenuItem> menuItemList, DailySpecials dailySpecials) { 

        this.menuItemList = menuItemList;
      this.dailySpecials = dailySpecials;
        this.type = "Regular";
    }


/** 
 *
 * Add menu item
 *
 * @param item  the item. 
 */
    public void addMenuItem(MenuItem item) { 

        menuItemList.add(item);
    }


/** 
 *
 * It is a constructor. 
 *
 * @param name  the name. 
 */
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

/** 
 *
 * Remove menu item
 *
 * @param item  the item. 
 */
    public void removeMenuItem(MenuItem item) { 

        menuItemList.remove(item);
    }


/** 
 *
 * Update menu item
 *
 * @param item  the item. 
 */
    public void updateMenuItem(MenuItem item) { 

        for (int i = 0; i < menuItemList.size(); i++) {
            if (menuItemList.get(i).getItemId() == item.getItemId()) {
                menuItemList.set(i, item);
                break;
            }
        }

        // Implementation for updating menu item
    }
}
