
/**
 *
 * @author Mohanned Ahmed
 */
public class Customer extends Person {
    private int ID;
    private int area;

    public Customer(int ID, int area) {
        this.ID = ID;
        this.area = area;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }    
}
