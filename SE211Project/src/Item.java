/**
 * @author MHD.Makeen AlDamouni - 215110141
 * @author Mohanned Ahmed - 215110114
 */
public class Item {
    private String name;
    private int price;
    private int estimatedDeliveryTime;

    public Item(String name, int price, int estimatedDeliveryTime) {
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
        return String.format("Name: %-20s | Price: %-20d | Estimated Delivery Time(Min): %d", name, price, estimatedDeliveryTime);
    }
}
