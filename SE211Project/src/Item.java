/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohanned Ahmed
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
        return "name= " + name + ", price= " + price + ", estimatedDeliveryTime= " + estimatedDeliveryTime;
    }
}
