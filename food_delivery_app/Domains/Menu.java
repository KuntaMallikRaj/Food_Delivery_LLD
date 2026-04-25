package food_delivery_app.Domains;

import java.util.List;

public class Menu {
    private List<Item> items;
    Restaurent restaurent;


    public Menu(List<Item> items, Restaurent restaurent) {
        this.items = items;
        this.restaurent = restaurent;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
