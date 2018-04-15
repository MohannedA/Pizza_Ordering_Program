import java.util.ArrayList;
/**
 *
 * @author Mohanned Ahmed
 */
public interface OrdersCalculatorInterface {
    
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
        
}
