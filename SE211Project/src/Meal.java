/**
 * @author MHD.Makeen AlDamouni - 215110141
 * @author Mohanned Ahmed - 215110114
 */
public class Meal {
    private Pizza pizza; 
    private Drink drink;
    private int price;
    private int estimatedDeliveryTime;

    public Meal(Pizza pizza, Drink drink) {
        this.pizza = pizza;
        this.drink = drink;
        this.price = pizza.getPrice() + drink.getPrice();
        this.estimatedDeliveryTime = pizza.getEstimatedDeliveryTime() + drink.getEstimatedDeliveryTime();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
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


}
