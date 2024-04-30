package cafe;
import java.util.ArrayList;
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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

  public int getCalories() {
      return calories;
  }

  public void setCalories(int calories) {
      this.calories = calories;
  }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public ArrayList<Food> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<Food> foodItems) {
        this.foodItems = foodItems;
    }

    public ArrayList<Drink> getDrinkItems() {
        return drinkItems;
    }

    public void setDrinkItems(ArrayList<Drink> drinkItems) {
        this.drinkItems = drinkItems;
    }

    public int getItemCalorieCount() {
        return itemCalorieCount;
    }

    public void setItemCalorieCount(int itemCalorieCount) {
        this.itemCalorieCount = itemCalorieCount;
    }

    public ArrayList<String> getItemPossibleAllergens() {
        return itemPossibleAllergens;
    }

    public void setItemPossibleAllergens(ArrayList<String> itemPossibleAllergens) {
        this.itemPossibleAllergens = itemPossibleAllergens;
    }

    public MenuItem(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
}
    // There is no error in this code
