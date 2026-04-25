package food_delivery_app.Domains;

import java.util.List;

public class Item {
   public String name;
   public String type;
   public double price;
   public boolean isAvailable;
   public int quantity;
    public Item(String name, String type, double price , boolean isAvailable , int quantity) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.isAvailable = isAvailable;
        this.quantity = quantity;

    }
    //getters and setters
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
