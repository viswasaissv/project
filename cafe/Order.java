package cafe;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.EnumSet;
import java.time.LocalTime;

 /**
 * The class Order
 */ 
public class Order {

    private LocalDateTime orderDateTime;
    private LocalDateTime pickUpDateTime;
    private ArrayList<MenuItem> menuItems;
    private Integer numberOfCalories;
    private Integer tableId;
    private LocalTime deliveryTimeEstimate;
   private Integer orderId;
   private String orderDetails;
   private EnumSet<OrderType> orderType;

   // Constructors


/** 
 *
 * It is a constructor. 
 *
 * @param orderId  the order identifier. 
 * @param orderDateTime  the order date time. 
 * @param orderDetails  the order details. 
 * @param orderType  the order type. 
 * @param pickUpDatetime  the pick up datetime. 
 * @param tableId  the table identifier. 
 * @param deliveryTimeEstimate  the delivery time estimate. 
 */
   public Order(Integer orderId, LocalDateTime orderDateTime, String orderDetails, EnumSet<OrderType> orderType, 
                LocalDateTime pickUpDatetime, int tableId, LocalTime deliveryTimeEstimate) {

       this.orderId = orderId;
       this.orderDateTime = orderDateTime;
       this.orderDetails = orderDetails;
       this.orderType = orderType;
       this.pickUpDateTime = pickUpDatetime;
       this.menuItems = new ArrayList<>();
       this.numberOfCalories = 0;
       this.tableId = tableId;
       this.deliveryTimeEstimate = deliveryTimeEstimate;
   }

   // Methods

/** 
 *
 * Add menu item
 *
 * @param item  the item. 
 */
   public void addMenuItem(MenuItem item) { 

       menuItems.add(item);
       numberOfCalories += item.getCalories();
   }


/** 
 *
 * Remove menu item
 *
 * @param item  the item. 
 */
   public void removeMenuItem(MenuItem item) { 

       menuItems.remove(item);
       numberOfCalories -= item.getCalories();
   }


/** 
 *
 * Select from menu
 *
 * @param menu  the menu. 
 */
   public void selectFromMenu(Menu menu) { 

       // Implement the logic to select menu items
   }


/** 
 *
 * Gets the approval Q
 *
 */
   public void getApprovalQ() { 

       // Implement the logic to get approval
   }


/** 
 *
 * Count number of calories
 *
 * @param item  the item. 
 * @return int
 */
   public int countNumberOfCalories(MenuItem item) { 

       return item.getCalories();
   }
   
}
