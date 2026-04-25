package food_delivery_app.Domains;

import java.util.List;

public class Cart {
    public enum STATUS { ACTIVE, INACTIVE }
    public User user;
    public Restaurent restaurent;
    public List<Item> items;
    public STATUS status;

    public Cart(User user, Restaurent restaurent, List<Item> items , STATUS status) {
        this.user = user;
        this.restaurent = restaurent;
        this.items = items;
        this.status = status;
    }
    //getters and setters
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Restaurent getRestaurent() {
        return restaurent;
    }
    public STATUS getStatus() {
        return status;
    }
    public void setStatus(STATUS status) {
        this.status = status;
    }
    public void setRestaurent(Restaurent restaurent) {
        this.restaurent = restaurent;
    }
    public List<Item> getItems() {
        return items;}
    public void setItems(List<Item> items) {
        this.items = items;
    }
   

}
