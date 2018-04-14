import java.util.ArrayList;
/**
 *
 * @author Mohanned Ahmed
 */
public interface OrderHandlerInterface {
    
    /**
     * This method is to calculate and return the total price.
     * @param meals Is array of meals which their price will be calculated.
     * @return The total price.
     */
    public abstract int getCalculatedTotalPrice(ArrayList<Meal> meals);
    
    /**
     * This method is to return the estimated delivery time.
     * @param meals Is array of meals which their delivery time will be estimated.
     * @return The estimated delivery time.
     */
    public abstract int getEstimatedDeliveryTime(ArrayList<Meal> meals);
    
    /**
     * This method is to read the menu from txt file and insert it in an ArrayList.
     * @param fileName The file which will be read. 
     * @return The ArratList of type Pizza.
     */
    public abstract ArrayList<Pizza> getObtainedPizzaMenu(String fileName);
    
    /**
     * This method is to read the menu from txt file and insert it in an ArrayList.
     * @param fileName The file which will be read. 
     * @return The ArratList of type Drink.
     */
    public abstract ArrayList<Drink> getObtainedDrinkMenu(String fileName);
        
}
