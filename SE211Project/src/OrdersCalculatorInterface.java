import java.util.ArrayList;
/**
 * To do the calculations related to orders such as calculate the total price.
 * @author MHD.Makeen AlDamouni - 215110141
 * @author Mohanned Ahmed - 215110114
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
