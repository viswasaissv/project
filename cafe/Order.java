package cafe;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.EnumSet;
import java.time.LocalTime;
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
   public void addMenuItem(MenuItem item) {
       menuItems.add(item);
       numberOfCalories += item.getCalories();
   }

   public void removeMenuItem(MenuItem item) {
       menuItems.remove(item);
       numberOfCalories -= item.getCalories();
   }

   public void selectFromMenu(Menu menu) {
       // Implement the logic to select menu items
   }

   public void getApprovalQ() {
       // Implement the logic to get approval
   }

   public int countNumberOfCalories(MenuItem item) {
       return item.getCalories();
   }
   
}
