/**
 *
 * @author Mohanned Ahmed
 */
public class Pizza {
    private String name;
    private int price;
    private int estimatedDeliveryTime;

    public Pizza(String name, int price, int estimatedDeliveryTime) {
        this.name = name;
        this.price = price;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(int estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    @Override
    public String toString() {
        return "name= " + name + ", price= " + price + ", estimatedDeliveryTime= " + estimatedDeliveryTime;
    }


    
}
