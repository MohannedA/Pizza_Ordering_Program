/**
 *
 * @author Mohanned Ahmed
 */
public class OrderImplementation implements Order {
    // Variables
    private Meal meals[]; // Is used to store the ordered meals.
    
    // Flags
    private boolean isAddingCustomersFinished = false; 
    
    @Override
    public int getCalculatedTotalPrice(Meal[] meals) {
        return 0;
    }

    @Override
    public void showDeliveryTime(Meal[] meals) {
        
    }
    
    public static void main(String[] args) {
        System.out.println("Enter customer name:");
    }
    
}
