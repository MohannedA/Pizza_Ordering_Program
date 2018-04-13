/**
 *
 * @author Mohanned Ahmed
 */
public interface Order {
    
    /**
     * This method is to calculate and return the total price.
     * @param meals Is array of meals which their price will be calculated.
     * @return The total price.
     */
    public abstract int getCalculatedTotalPrice(Meal[] meals);
    
    /**
     * This method is to show the calculated delivery time.
     * @param meals Is array of meals which their delivery time will be calculated. 
     */
    public abstract void showDeliveryTime(Meal[] meals);
    
}
