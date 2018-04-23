import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * This is the main class(contains main method).
 * @author MHD.Makeen AlDamouni - 215110141
 * @author Mohanned Ahmed - 215110114
 */
public class Order {
    // To store the ordered meals.
    private static ArrayList<Meal> meals = new ArrayList<Meal>(); 
    // To store the menu pizza itames that obtaiend from pizza menu txt file.
    private static ArrayList<Pizza> pizzaMenuItems; 
    // To store the menu drink itames that obtaiend from drink menu txt file.
    private static ArrayList<Drink> drinkMenuItems; 
    
    // Var. to use in csutomer input.
    private static int customerChoice = 0;
    private static String pizzaName;
    private static String drinkName;
    // Define scanner to read customers orders, etc.
    private static final Scanner scanner = new Scanner(System.in);
     
    /**
     * This method is to show system introduction such as welcome statement. 
     */
    private static void showSystemIntro() {
        System.out.println("Welcome to our pizza ordring application\n");
        // Show the pizza menu.
        System.out.println("Pizza Menu");
        for (int i = 0; i < pizzaMenuItems.size(); i++) {
            System.out.println(pizzaMenuItems.get(i).toString());
        }
        // Sprate the menues.
        System.out.println("\n----------------------------\n");
        // Show the drinks menu.
        System.out.println("Drinks Menu");
        for (int i = 0; i < drinkMenuItems.size(); i++) {
            System.out.println(drinkMenuItems.get(i).toString());
        }
        
    }
    /**
     * Show ordering pizza instructions. 
     */
    private static void showInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 1- To display the list of orders.");
        System.out.println("\t 2- To add an order to the list.");
        System.out.println("\t 3- To remove the last order from the list.");
        System.out.println("\t 4- To save the orders adn quit.");
    }
    
    /**
     * To handle customer choice input and if customer inputs something which is not int.
     */
    private static void handleCustomerChoiceInput() {
        boolean continueInput = true;
        do {
            try {
                customerChoice = scanner.nextInt();
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("You should enter number...Try again:");
                // Show the system instructions.
                showInstructions();
                // Discard the bad input. 
                scanner.nextLine();
            }
        } while (continueInput); // Loop until the user enters it correctly. 
    }
    
    /**
     * This method is to add new order to the ordered meals. 
     * @param pizzaMenuItems The array which will check the new order pizza according to it. 
     * @param drinkMenuItems The array which will check the new order drink according to it.
     * @param meals The array which the new order will be added to it.
     */
    private static void addOrder() {
        // Pizza  Var. 
        boolean isPizzaExistInMenu = false;
        int pizzaPrice = 0;
        int pizzaDeliveryTime = 0;
        // Drink Var.
        boolean isDrinkExistInMenu = false;
        int drinkPrice = 0;
        int drinkDeliveryTime = 0;
        
        System.out.println("Enter your order in the format: <PizzaName> <DrinkName>.");
        
        // Get customer's input. 
        pizzaName = scanner.next();
        drinkName = scanner.next();
        
        // Check if pizza exit in the menu. If so, store the pizza prica and est. delivery time.
        for (int i = 0; i < pizzaMenuItems.size(); i++) {
            if (pizzaMenuItems.get(i).getName().equalsIgnoreCase(pizzaName)) {
                isPizzaExistInMenu = true;
                pizzaPrice = pizzaMenuItems.get(i).getPrice();
                pizzaDeliveryTime = pizzaMenuItems.get(i).getEstimatedDeliveryTime();
            }
        }
        // Check if the drink exit in the menu. If so, store the drink prica and est. delivery time. 
        for (int i = 0; i < drinkMenuItems.size(); i++) {
            if (drinkMenuItems.get(i).getName().equalsIgnoreCase(drinkName)) {
                isDrinkExistInMenu = true;
                drinkPrice = drinkMenuItems.get(i).getPrice();
                drinkDeliveryTime = drinkMenuItems.get(i).getEstimatedDeliveryTime();
            }
        }
        // Both pizza and drink exist.
        if (isDrinkExistInMenu && isPizzaExistInMenu) { 
            // Add ordered pizza and orderd drink.
            Pizza orderedPizza = new Pizza(pizzaName, pizzaPrice, pizzaDeliveryTime);
            Drink orderedDrink = new Drink(drinkName,drinkPrice, drinkDeliveryTime);
            meals.add(new Meal(orderedPizza, orderedDrink));
            System.out.println("Your order is added");
        }
        // If the ordered drink is not on the menu.
        if (!isDrinkExistInMenu)
            System.out.println("The drink " + drinkName + " is not on the menu...Try Again.");
        // If the ordered pizza is not on the menu.
        if (!isPizzaExistInMenu) { 
            System.out.println("The pizza " + pizzaName + " is not on the menu...Try Again.");
        }  
           
    } 
    /**
     * This method is to display all the orders in the ordered meals.
     * @param meals The array which will its content will be displayed.
     */
    private static void displayOrders() {
        if (!meals.isEmpty()) {
            for (int i = 0; i < meals.size(); i++) {
                System.out.println("Meal " + (i+1) + " contains: " + meals.get(i).getPizza().getName() + " Pizza & " +
                        meals.get(i).getDrink().getName() + " Drink");
            }
        } else {
            System.out.println("Your orders list is empty.");
        }
    }
    
    /**
     * This method is to remove last order from list of meals. 
     */
    private static void removeLastOrder() {
        // Remove last meal if list is not empty, otherwise inform the user that is empty.
        if (!meals.isEmpty()) {
            meals.remove(meals.size()-1);
            System.out.println("You removed the last ordered meal.");
        }
        else 
            System.out.println("You cannot remove last meal because list is already empty.");
    }
    
    public static void main(String[] args) {
        
        // To do orders calculations. 
        OrdersCalculator ordersCalculator = new OrdersCalculator();
        
        // Obtain the pizza menu items.
        pizzaMenuItems = Pizza.getObtainedPizzaMenu("pizzaMenu.txt");
        
        // Obtain the drink menu items.
        drinkMenuItems = Drink.getObtainedDrinkMenu("drinkMenu.txt");
        
        // Show the system introtduction. 
        showSystemIntro();
        
        // Show the system instructions.
        showInstructions();
        
        System.out.println("What do want to do?");
        // To handle customer's input.
        handleCustomerChoiceInput();
        // Loop until quit (4 is entered) is pressed.  
        while (customerChoice != 4) {
            switch (customerChoice) {
                case 1: // Display the ordered meals.
                    displayOrders();
                    break;
                case 2: // Add new order meal.
                    addOrder();
                    break;
                case 3: // Remove last order meal.
                    removeLastOrder();
                    break;
                default: // Show the system instructions if user enter number that is not in instructions list.
                    showInstructions();
            }
            System.out.println("What do want to do?");
            // To handle customer's input.
            handleCustomerChoiceInput();
        }
        // Display the final result. 
        System.out.println("\nThank you for ordring from us.");
        System.out.println("\nYou Ordered:");
        // Display the meals.
        displayOrders();
        // Diaplay the total price.
        System.out.println("\nThe Total Price is " + ordersCalculator.getCalculatedTotalPrice(meals));
        // Display the estimated delivery time. 
        System.out.println("The Estimated Delivery Time is " + ordersCalculator.getEstimatedDeliveryTime(meals));
    } 
}
