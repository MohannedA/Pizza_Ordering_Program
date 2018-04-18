
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * To do the calculations related to orders such as calculate the total price.
 * @author Mohanned Ahmed - 215110114
 */
public class OrdersCalculator implements OrdersCalculatorInterface{
    
    public OrdersCalculator() {}
    
    @Override
    public int getCalculatedTotalPrice(ArrayList<Meal> meals) {
        int totalPrice = 0;
        // Sum up all the prices of the orders.
        for (int i = 0; i < meals.size(); i++) {
            totalPrice += meals.get(i).getPrice();
        }
        return totalPrice;
    }
    
    @Override
    public int getEstimatedDeliveryTime(ArrayList<Meal> meals) {
        int estimatedDeliveryTime = 0;
        // Sum up all the estimated delivery time of the orders. 
        for (int i = 0; i < meals.size(); i++) {
            estimatedDeliveryTime += meals.get(i).getEstimatedDeliveryTime();
        }
        return estimatedDeliveryTime;
    }
    
}
