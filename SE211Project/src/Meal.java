/**
 *
 * @author Mohanned Ahmed
 */
public class Meal {
    private Pizza pizza; 
    private Drink drink;

    public Meal(Pizza pizza, Drink drink) {
        this.pizza = pizza;
        this.drink = drink;
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
    
    
}
