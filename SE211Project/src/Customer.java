/**
 * 
 * @author Mohanned Ahmed - 215110114
 */
public class Customer {
    private String name; // Customer's name 
    private String phoneNumber; // Customer's phone number
    private int ID; // Customer's ID 
    private int area; // Customer's area

    public Customer(String name, String phoneNumber, int ID, int area) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
