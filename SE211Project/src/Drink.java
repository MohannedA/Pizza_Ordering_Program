import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author MHD.Makeen AlDamouni - 215110141
 * @author Mohanned Ahmed - 215110114
 */
public class Drink extends Item{

    public Drink(String name, int price, int estimatedDeliveryTime) {
        super(name, price, estimatedDeliveryTime);
    }
    
    /**
     * This method is to read the menu from txt file and insert it in an ArrayList.
     * @param fileName The file which will be read. 
     * @return The ArratList of type Drink.
     */
    public static ArrayList<Drink> getObtainedDrinkMenu(String fileName) {
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
           System.out.println("Menu file is not found.");
       }
       return obtainedDrinkMenu;
   }

}
