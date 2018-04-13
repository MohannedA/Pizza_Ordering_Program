/**
 *
 * @author Mohanned Ahmed
 */
public class Pizza {
    private String name;
    private int size; // The should be either 1, 2, or 3.  

    public Pizza(String name, int size) {
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
