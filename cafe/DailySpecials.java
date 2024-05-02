package cafe;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;


 /**
 * The class Daily specials
 */ 
public class DailySpecials {
    private Map<String, ArrayList<MenuItem>> specialsBasedOnDay = new HashMap<>();


/** 
 *
 * It is a constructor. 
 *
 * @param day  the day. 
 * @param menuitems  the menuitems. 
 */
    public DailySpecials(String day, ArrayList<MenuItem> menuitems) { 

        specialsBasedOnDay.put("Monday", new ArrayList<MenuItem>());
        specialsBasedOnDay.put("Tuesday", new ArrayList<MenuItem>());
        specialsBasedOnDay.put("Wednesday", new ArrayList<MenuItem>());
        specialsBasedOnDay.put("Thursday", new ArrayList<MenuItem>());
        specialsBasedOnDay.put("Friday", new ArrayList<MenuItem>());
        specialsBasedOnDay.put("Saturday", new ArrayList<MenuItem>());
        specialsBasedOnDay.put("Sunday", new ArrayList<MenuItem>());

        this.specialsBasedOnDay.replace(day, menuitems);
    }



/** 
 *
 * It is a constructor. 
 *
 * @param specialsBasedOnDay  the specials based on day. 
 */
  public DailySpecials(Map<String, ArrayList<MenuItem>> specialsBasedOnDay) 
  {

    this.specialsBasedOnDay = specialsBasedOnDay;
  }

/** 
 *
 * Gets the specials based on day
 *
 * @return the specials based on day
 */
   public Map<String, ArrayList<MenuItem>> getSpecialsBasedOnDay(){ 

     return this.specialsBasedOnDay;
   }
     

}
