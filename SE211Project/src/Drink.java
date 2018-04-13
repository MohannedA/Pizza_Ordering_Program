/**
 *
 * @author Mohanned Ahmed
 */
public class Drink {
    private String name;
    private int size; // The size should be from 1, 2, or 3.

    public Drink(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
}
