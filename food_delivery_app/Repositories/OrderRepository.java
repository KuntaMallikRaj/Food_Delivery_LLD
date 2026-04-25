package food_delivery_app.Repositories;

import food_delivery_app.Domains.*;

import java.util.List;



public class OrderRepository {
    
    public void addRestaurent(Restaurent restaurent, Location location) {
        //code to add restaurent to database
        List<Restaurent> restaurents = location.getNearbyRestaurants();
        restaurents.add(restaurent);
        location.setNearbyRestaurants(restaurents);
    }
    public List<Restaurent> getRestaurentsByLocation(Location location) {
        //code to get restaurents based on location
        return location.getNearbyRestaurants();
        //query run for db.
    }

    public Menu getMenu(Restaurent restaurent) {
        return restaurent.getMenu();
    }

    public Cart addCart(User user , List<Item>items , Restaurent restaurent) {
        Cart cart = new Cart(user, restaurent, items, Cart.STATUS.ACTIVE);
        user.setCart(cart);
        return cart;
    }

    public List<Item> viewOrder(User user) {
        Cart cart = user.getCart();
        if (cart == null) return new java.util.ArrayList<>();
        return cart.getItems();
    }
}
