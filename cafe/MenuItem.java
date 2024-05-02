package cafe;
import java.util.ArrayList;

 /**
 * The class Menu item
 */ 
public class MenuItem {
  
    private String itemName;
    private int itemId;
    private double itemPrice;
  private int calories;
    private String itemDescription;
    private String itemCategory;
    private ArrayList<Food> foodItems;
    private ArrayList<Drink> drinkItems;
    private int itemCalorieCount;
    private ArrayList<String> itemPossibleAllergens;


/** 
 *
 * Gets the item name
 *
 * @return the item name
 */
    public String getItemName() { 

        return itemName;
    }


/** 
 *
 * Sets the item name
 *
 * @param itemName  the item name. 
 */
    public void setItemName(String itemName) { 

        this.itemName = itemName;
    }


/** 
 *
 * Gets the item identifier
 *
 * @return the item identifier
 */
    public int getItemId() { 

        return itemId;
    }


/** 
 *
 * Sets the item identifier
 *
 * @param itemId  the item identifier. 
 */
    public void setItemId(int itemId) { 

        this.itemId = itemId;
    }


/** 
 *
 * Gets the calories
 *
 * @return the calories
 */
  public int getCalories() { 

      return calories;
  }


/** 
 *
 * Sets the calories
 *
 * @param calories  the calories. 
 */
  public void setCalories(int calories) { 

      this.calories = calories;
  }


/** 
 *
 * Gets the item price
 *
 * @return the item price
 */
    public double getItemPrice() { 

        return itemPrice;
    }


/** 
 *
 * Sets the item price
 *
 * @param itemPrice  the item price. 
 */
    public void setItemPrice(double itemPrice) { 

        this.itemPrice = itemPrice;
    }


/** 
 *
 * Gets the item description
 *
 * @return the item description
 */
    public String getItemDescription() { 

        return itemDescription;
    }


/** 
 *
 * Sets the item description
 *
 * @param itemDescription  the item description. 
 */
    public void setItemDescription(String itemDescription) { 

        this.itemDescription = itemDescription;
    }


/** 
 *
 * Gets the item category
 *
 * @return the item category
 */
    public String getItemCategory() { 

        return itemCategory;
    }


/** 
 *
 * Sets the item category
 *
 * @param itemCategory  the item category. 
 */
    public void setItemCategory(String itemCategory) { 

        this.itemCategory = itemCategory;
    }


/** 
 *
 * Gets the food items
 *
 * @return the food items
 */
    public ArrayList<Food> getFoodItems() { 

        return foodItems;
    }


/** 
 *
 * Sets the food items
 *
 * @param foodItems  the food items. 
 */
    public void setFoodItems(ArrayList<Food> foodItems) { 

        this.foodItems = foodItems;
    }


/** 
 *
 * Gets the drink items
 *
 * @return the drink items
 */
    public ArrayList<Drink> getDrinkItems() { 

        return drinkItems;
    }


/** 
 *
 * Sets the drink items
 *
 * @param drinkItems  the drink items. 
 */
    public void setDrinkItems(ArrayList<Drink> drinkItems) { 

        this.drinkItems = drinkItems;
    }


/** 
 *
 * Gets the item calorie count
 *
 * @return the item calorie count
 */
    public int getItemCalorieCount() { 

        return itemCalorieCount;
    }


/** 
 *
 * Sets the item calorie count
 *
 * @param itemCalorieCount  the item calorie count. 
 */
    public void setItemCalorieCount(int itemCalorieCount) { 

        this.itemCalorieCount = itemCalorieCount;
    }


/** 
 *
 * Gets the item possible allergens
 *
 * @return the item possible allergens
 */
    public ArrayList<String> getItemPossibleAllergens() { 

        return itemPossibleAllergens;
    }


/** 
 *
 * Sets the item possible allergens
 *
 * @param itemPossibleAllergens  the item possible allergens. 
 */
    public void setItemPossibleAllergens(ArrayList<String> itemPossibleAllergens) { 

        this.itemPossibleAllergens = itemPossibleAllergens;
    }


/** 
 *
 * It is a constructor. 
 *
 * @param itemName  the item name. 
 * @param itemPrice  the item price. 
 */
    public MenuItem(String itemName, double itemPrice) { 

        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
}
    // There is no error in this code
