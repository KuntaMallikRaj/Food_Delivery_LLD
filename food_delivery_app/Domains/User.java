package food_delivery_app.Domains;

public class User {
public String name;
public String phone;
public int ID;
public Cart cart;
public User(String name) {
    this.name = name;
    this.phone = "";
    this.ID = 0;
    this.cart = null;
}

public User(String name, String phone, int ID , Cart cart) {
    this.name = name;
    this.phone = phone;
    this.ID = ID;
    this.cart = cart;
}
//getters and setters
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;

}
public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}
public int getID() {
    return ID;
}
public void setID(int ID) {
    this.ID = ID;
}
public Cart getCart() {
    return cart;
}
public void setCart(Cart cart) {
    this.cart = cart;
}
}
