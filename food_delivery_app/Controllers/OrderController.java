package food_delivery_app.Controllers;
import java.util.List;

import food_delivery_app.Domains.*;
import food_delivery_app.Domains.State.Order;
import food_delivery_app.Services.*;

public class OrderController {
    //user chooses the restaurent of location
    public void chooseRestaurent(User user, Location location) {
        //code to choose restaurent based on location
        if(location == null) {
            System.out.println("[LOCATION NOT FOUND]We currently do not have any restaurents in your location");
            return;
        }
        System.out.println("Restaurents in your location:");
        OrderService orderService = new OrderService();
        orderService.getRestaurentsByLocation(location);
     

    }

    public void addRestaurent(Restaurent restaurent, Location location) {
        //code to add restaurent to database
        OrderService orderService = new OrderService();
        orderService.addRestaurent(restaurent, location);
    }

    
     //user selects items in the menu

    public void listMenu(Restaurent restaurent) {
        //code to list menu of the restaurent
        if(restaurent == null) {
            System.out.println("[RESTAURENT NOT FOUND]Please enter restaurent name");
            return;
        }
        System.out.println("Menu of " + restaurent.getName() + ":");
       OrderService orderService = new OrderService();
       orderService.getMenu(restaurent);
     }
//carting
     //adding cart
    public void addToCart(User user, List<Item> items, Restaurent restaurent) {
        //code to add items to cart
        OrderService orderService = new OrderService();
        orderService.addCart(user, items, restaurent);
    }
    //removing cart
    public void removeFromCart(User user, List<Item> items , Restaurent restaurent) {
        OrderService orderService = new OrderService();
        orderService.removeCart(user, items, restaurent);
    }

    public void viewCart(User user) {
       OrderService orderService  =  new OrderService();
       orderService.viewOrder(user);
    }

    public int totalAmount(User user) {
        OrderService orderService  =  new OrderService();
        return orderService.totalAmount(user);
    }

    //place the order

}
