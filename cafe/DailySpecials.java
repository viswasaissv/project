package cafe;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class DailySpecials {
    private Map<String, ArrayList<MenuItem>> specialsBasedOnDay = new HashMap<>();

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

  public DailySpecials(Map<String, ArrayList<MenuItem>> specialsBasedOnDay)
  {
    this.specialsBasedOnDay = specialsBasedOnDay;
  }
   public Map<String, ArrayList<MenuItem>> getSpecialsBasedOnDay(){
     return this.specialsBasedOnDay;
   }
     

}