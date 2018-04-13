/**
 * 
 *
 * @author Mohanned Ahmed
 */
public class Meal {
    private Pizza pizza; 
    private Drink drink;
    private int price;

    public Meal(Pizza pizza, Drink drink, int price) {
        this.pizza = pizza;
        this.drink = drink;
        this.price = price;
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
}
