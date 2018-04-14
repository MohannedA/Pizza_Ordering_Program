import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Mohanned Ahmed
 */
public class Order {
    // Is used to store the ordered meals.
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
    private static Scanner scanner = new Scanner(System.in);
     
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
        // To sprate the menues
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
        System.out.println("\t 1- To display the list of items.");
        System.out.println("\t 2- To add an item to the list.");
        System.out.println("\t 3- To remove the last item from the list.");
        System.out.println("\t 4- To save the orders adn quit.");
    }
    
    /**
     * To handle customer add meal input and if customer inputs something which is not int.
     */
    private static void handleCustomerAddMealInput() {
        boolean continueInput = true;
        do {
            try {
                pizzaName = scanner.next();
                drinkName = scanner.next();
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("You should enter it correctly...Try again:");
                // Show the fprmat agin. 
                System.out.println("Enter your orders in the format: <PizzaName> <DrinkName>");
                // Discard the bad input. 
                scanner.nextLine();
            }
        } while (continueInput);
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
        } while (continueInput);
    }
    
    private static void addMeal() {
        // Pizza  Var. 
        boolean isPizzaExistInMenu = false;
        int pizzaPrice = 0;
        int pizzaDeliveryTime = 0;
        // Drink Var.
        boolean isDrinkExistInMenu = false;
        int drinkPrice = 0;
        int drinkDeliveryTime = 0;        
        System.out.println("Enter your orders in the format: <PizzaName> <DrinkName>");
        // To handle customer input.
        handleCustomerAddMealInput();
        
        // Check if pizza exit in the menu.
        for (int i = 0; i < pizzaMenuItems.size(); i++) {
            if (pizzaMenuItems.get(i).getName().equalsIgnoreCase(pizzaName)) {
                isPizzaExistInMenu = true;
                pizzaPrice = pizzaMenuItems.get(i).getPrice();
                pizzaDeliveryTime = pizzaMenuItems.get(i).getEstimatedDeliveryTime();
            }
        }
        // Check if the drink exit in the menu.
        for (int i = 0; i < drinkMenuItems.size(); i++) {
            if (drinkMenuItems.get(i).getName().equalsIgnoreCase(drinkName)) {
                isDrinkExistInMenu = true;
                drinkPrice = drinkMenuItems.get(i).getPrice();
                drinkDeliveryTime = drinkMenuItems.get(i).getEstimatedDeliveryTime();
            }
        }
        // If the ordered pizza is not on the menu.
        if (!isPizzaExistInMenu) 
            System.out.println("The pizza " + pizzaName + " is not on the menu...Try Agin");
        // If the ordered drink is not on the menu.
        else if (!isDrinkExistInMenu)
            System.out.println("The drink " + drinkName + " is not on the menu...Try Agin");
        // Both pizza and drink exist.
        else { 
            // Add ordered pizza and orderd drink.
            Pizza orderedPizza = new Pizza(pizzaName, pizzaPrice, pizzaDeliveryTime);
            Drink orderedDrink = new Drink(drinkName,drinkPrice, drinkDeliveryTime);
            meals.add(new Meal(orderedPizza, orderedDrink));
            System.out.println("Your order is added");
        }
           
    } 
    
    private static void displayMeals() {
        if (!meals.isEmpty()) {
            for (int i = 0; i < meals.size(); i++) {
                System.out.println("Meal " + (i+1) + " contains: " + meals.get(i).getPizza().getName() + " Pizza & " +
                        meals.get(i).getDrink().getName() + " Drink");
            }
        } else {
            System.out.println("Your orders list is empty.");
        }
    }
    
    public static void main(String[] args) {
        
        // To handle the orders processes. 
        OrderHandler orderHandler = new OrderHandler();
        
        // Obtain the pizza menu items.
        pizzaMenuItems = orderHandler.getObtainedPizzaMenu("pizzaMenu.txt");
        
        // Obtain the drink menu items.
        drinkMenuItems = orderHandler.getObtainedDrinkMenu("drinkMenu.txt");
        
        // Show the system introtduction. 
        showSystemIntro();
        
        // Show the system instructions.
        showInstructions();
        
        System.out.println("What do want to do?");
        // To handle customer input.
        handleCustomerChoiceInput();
        // Loop until quit (Enter 4) is pressed.  
        while (customerChoice != 4) {
            switch (customerChoice) {
                case 1: // Display the ordered meals.
                    displayMeals();
                    break;
                case 2: // Add new meal.
                    addMeal();
                    break;
                case 3:
                    // Remove last meal if list is not empty, otherwise inform the user that is empty.
                    if (!meals.isEmpty())
                        meals.remove(meals.size()-1);
                    else 
                        System.out.println("You cannot remove last meal because list is already empty.");
                    break;
                default:
                    // Show the system instructions if user enter number that is not in instructions list
                    showInstructions();
            }
            System.out.println("What do want to do?");
            // To handle customer input.
            handleCustomerChoiceInput();
        }
        System.out.println("\nThank you for ordring from us.");
        System.out.println("\nYou Ordered:\n");
        // To show the meals.
        displayMeals();
        System.out.println("The Total Price is " + orderHandler.getCalculatedTotalPrice(meals));
        System.out.println("The Estimated Delivery Time is " + orderHandler.getEstimatedDeliveryTime(meals));
    }
    
}
