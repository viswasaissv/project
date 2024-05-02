package cafe;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

 /**
 * The class Drink
 */ 
public class Drink {
    private int id;
    private String name;
    private double price;
    private int calories;


/** 
 *
 * Gets the identifier
 *
 * @return the identifier
 */
    public int getId() { 

        return id;
    }


/** 
 *
 * Sets the identifier
 *
 * @param id  the id. 
 */
    public void setId(int id) { 

        this.id = id;
    }


/** 
 *
 * Gets the name
 *
 * @return the name
 */
    public String getName() { 

        return name;
    }


/** 
 *
 * Sets the name
 *
 * @param name  the name. 
 */
    public void setName(String name) { 

        this.name = name;
    }


/** 
 *
 * Gets the price
 *
 * @return the price
 */
    public double getPrice() { 

        return price;
    }


/** 
 *
 * Sets the price
 *
 * @param price  the price. 
 */
    public void setPrice(double price) { 

        this.price = price;
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
}
