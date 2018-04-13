/**
 *
 * @author Mohanned Ahmed
 */
public interface Order {
    
    /**
     * This method is to calculate and return the total price.
     * @param meals - Array of meals which their price will be calculated.
     * @return The total price.
     */
    public abstract int getCalculatedTotalPrice(Meal[] meals);
    
    /**
     * This method is to calculate and return the delivery time.
     * @param meals - Array of meals which their delivery time will be calculated. 
     * @return - The total delivery time. 
     */
    public abstract int showDeliveryTime(Meal[] meals);
}
