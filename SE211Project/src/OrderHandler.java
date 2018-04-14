
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * To handle orders process such as calculate the total price
 * @author Mohanned Ahmed
 */
public class OrderHandler implements OrderHandlerInterface{

    public OrderHandler() {}
    

    @Override
    public int getCalculatedTotalPrice(ArrayList<Meal> meals) {
        int totalPrice = 0;
        for (int i = 0; i < meals.size(); i++) {
            totalPrice += meals.get(i).getPrice();
        }
        return totalPrice;
    }
    
    @Override
    public int getEstimatedDeliveryTime(ArrayList<Meal> meals) {
        int estimatedDeliveryTime = 0;
        for (int i = 0; i < meals.size(); i++) {
            estimatedDeliveryTime += meals.get(i).getEstimatedDeliveryTime();
        }
        return estimatedDeliveryTime;
    }
    
    @Override
    public ArrayList<Pizza> getObtainedPizzaMenu(String fileName) {
        // Variables
        ArrayList<Pizza> obtainedPizzaMenu = new ArrayList<Pizza>();
        String pizzaName;
        int pizzaPrice;
        int pizzaEstimatedDeliveryTime;
        Pizza pizza;
     
        // Define a file path.
        File file = new File(fileName);
        
        // Define scanner to read the pizza menu txt file. 
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            // Ignore first line which containes the labels of columns.
            scanner.nextLine();

            // Loop until all the lines are read.
            while (scanner.hasNext()) {
                // Read the pizza name.
                pizzaName = scanner.next();
                // Read the pizza price and convert it from string to int.
                pizzaPrice = Integer.parseInt(scanner.next());
                // Read the pizza estimated delivery time and convert it from string to int.
                pizzaEstimatedDeliveryTime = Integer.parseInt(scanner.next());
                // Define new pizza object with the read pizza name and pizza price.
                pizza = new Pizza(pizzaName, pizzaPrice, pizzaEstimatedDeliveryTime);
                // Add the new pizza object to the pizza array list.
                obtainedPizzaMenu.add(pizza);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OrderHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return obtainedPizzaMenu;
    }
    
    @Override
    public ArrayList<Drink> getObtainedDrinkMenu(String fileName) {
        // Variables
        ArrayList<Drink> obtainedDrinkMenu = new ArrayList<Drink>();
        String drinkName;
        int drinkPrice;
        int drinkEstimatedDeliveryTime;
        Drink drink;
        
        // Define a file path.
        File file = new File(fileName);
        
        // Define scanner to read the pizza menu txt file and handle if file not found. 
        Scanner scanner;
        try { // File is found.
            scanner = new Scanner(file);
            // Ignore first line which containes the labels of columns.
            scanner.nextLine();

            // Loop until all the lines are read.
            while (scanner.hasNext()) {
                // Read the pizza name.
                drinkName = scanner.next();
                // Read the pizza price and convert it from string to int.
                drinkPrice = Integer.parseInt(scanner.next());
                // Read the pizza estimated delivery time and convert it from string to int.
                drinkEstimatedDeliveryTime = Integer.parseInt(scanner.next());            
                // Define new pizza object with the read pizza name and pizza price.
                drink = new Drink(drinkName, drinkPrice, drinkEstimatedDeliveryTime);
                // Add the new pizza object to the pizza array list.
                obtainedDrinkMenu.add(drink);
            }
        } catch (FileNotFoundException ex) { // File is not found.
            Logger.getLogger(OrderHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obtainedDrinkMenu;
    }
    
}
