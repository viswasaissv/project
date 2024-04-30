import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

import cafe.Menu;
import cafe.MenuItem;
import cafe.Food;
import cafe.Drink;
import cafe.DailySpecials;
import cafe.Order;
import cafe.OrderType;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Scanner scanner = new Scanner(System.in);

        // Create menu items dynamically
        ArrayList<MenuItem> menuItems = createMenuItems(scanner);

        // Create daily specials dynamically
        DailySpecials dailySpecials = createDailySpecials(scanner, menuItems);

        // Create a menu
        Menu menu = new Menu(menuItems, dailySpecials);

        // Create orders dynamically
        List<Order> orders = createOrders(scanner, menu);

        // Create the main menu screen
        VBox menuScreen = new VBox();
        Button orderButton = new Button("Place Order");
        menuScreen.getChildren().add(orderButton);

        // Create the order screen
        VBox orderScreen = new VBox();
        Button backButton = new Button("Back to Menu");
        orderScreen.getChildren().add(backButton);

        // Set actions for buttons
        orderButton.setOnAction(event -> primaryStage.setScene(new Scene(orderScreen, 300, 300)));
        backButton.setOnAction(event -> primaryStage.setScene(new Scene(menuScreen, 300, 300)));

        // Set the initial scene to the main menu screen
        primaryStage.setScene(new Scene(menuScreen, 300, 300));
        primaryStage.setTitle("Restaurant Ordering System");
        primaryStage.show();
    }

    private ArrayList<MenuItem> createMenuItems(Scanner scanner) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        System.out.println("Enter menu items (name price calories), enter 'done' to finish:");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) break;

            String[] parts = input.split(" ");
            if (parts.length != 3) {
                System.out.println("Invalid input, please enter name price calories");
                continue;
            }

            String name = parts[0];
            double price = Double.parseDouble(parts[1]);
            int calories = Integer.parseInt(parts[2]);

            menuItems.add(new MenuItem(name, price));
        }

        return menuItems;
    }

    private DailySpecials createDailySpecials(Scanner scanner, ArrayList<MenuItem> menuItems) {
        Map<String, ArrayList<MenuItem>> specialsMap = new HashMap<>();

        System.out.println("Enter daily specials for each day (day name, followed by menu item names), enter 'done' to finish:");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) break;

            String[] parts = input.split(" ");
            if (parts.length < 2) {
                System.out.println("Invalid input, please enter day name menu item names");
                continue;
            }

            String day = parts[0];
            ArrayList<MenuItem> specials = new ArrayList<>();
            for (int i = 1; i < parts.length; i++) {
                String itemName = parts[i];
                MenuItem item = menuItems.stream().filter(menuItem -> menuItem.getItemName().equalsIgnoreCase(itemName)).findFirst().orElse(null);
                if (item != null) {
                    specials.add(item);
                } else {
                    System.out.println("Menu item not found: " + itemName);
                }
            }
            specialsMap.put(day, specials);
        }

        return new DailySpecials(specialsMap);
    }

    private List<Order> createOrders(Scanner scanner, Menu menu) {
        List<Order> orders = new ArrayList<>();

        System.out.println("Enter orders (order details), enter 'done' to finish:");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) break;

            System.out.println("Enter order type (EAT_IN, TAKEAWAY, DELIVERY):");
            String orderTypeInput = scanner.nextLine().trim();
            OrderType orderType = OrderType.valueOf(orderTypeInput.toUpperCase());

            System.out.println("Enter table id:");
            int tableId = Integer.parseInt(scanner.nextLine().trim());

            Order order = new Order(null, LocalDateTime.now(), input, EnumSet.of(orderType),
                    LocalDateTime.now(), tableId, LocalTime.of(0, 30));

            System.out.println("Enter menu items (comma separated):");
            String menuItemsInput = scanner.nextLine().trim();
            String[] menuItemNames = menuItemsInput.split(",");
            for (String itemName : menuItemNames) {
                MenuItem menuItem = menu.findMenuItemByName(itemName.trim());
                if (menuItem != null) {
                    order.addMenuItem(menuItem);
                } else {
                    System.out.println("Menu item not found: " + itemName);
                }
            }

            orders.add(order);
        }

        return orders;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
