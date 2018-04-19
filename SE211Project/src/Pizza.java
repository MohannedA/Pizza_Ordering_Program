import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Mohanned Ahmed
 */
public class Pizza extends Item {
    public Pizza(String name, int price, int estimatedDeliveryTime) {
        super(name, price, estimatedDeliveryTime);
    }
    
    /**
     * This method is to read the menu from txt file and insert it in an ArrayList.
     * @param fileName The file which will be read. 
     * @return The ArratList of type Pizza.
     */
    public static ArrayList<Pizza> getObtainedPizzaMenu(String fileName) {
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
            System.out.println("Menu file is not found.");
        }
        
        return obtainedPizzaMenu;
    }
}
