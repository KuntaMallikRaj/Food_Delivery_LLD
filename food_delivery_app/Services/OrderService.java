package food_delivery_app.Services;

import food_delivery_app.Domains.*;
import food_delivery_app.Domains.State.Order;
import food_delivery_app.Repositories.*;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    
    public void setRestaurentsByLocation(Location location) {
        //code to get restaurents based on location
    }

    public void addRestaurent(Restaurent restaurent, Location location) {
        //code to add restaurent to database
        OrderRepository orderRepository = new OrderRepository();
        orderRepository.addRestaurent(restaurent, location);
    }

    public void getRestaurentsByLocation(Location location) {
        OrderRepository orderRepository = new OrderRepository();
        List<Restaurent> restaurents = orderRepository.getRestaurentsByLocation(location);
        for (Restaurent r : restaurents) {
            System.out.println("- " + r.getName());
        }
    }
    public void getMenu(Restaurent restaurent) {
        OrderRepository orderRepository = new OrderRepository();
        Menu menu = orderRepository.getMenu(restaurent);
        if (menu == null) { System.out.println("No menu available."); return; }
        for (Item item : menu.getItems()) {
            System.out.println("- " + item.getName() + " (" + item.getType() + ") - Rs." + item.getPrice());
        }
    }
    public void addCart(User user, List<Item> items, Restaurent restaurent) 
    {
        //code to add items to cart
        OrderRepository orderRepository = new OrderRepository();
        Menu menu = orderRepository.getMenu(restaurent);
        List<Item> itemsToAdd = menu.getItems();
        // decremnt the quantity of the items in the menu
        // add the items to the cart
        List<Item>finalCart = new ArrayList<>();
        for (Item item : items) {
            if (itemsToAdd.contains(item)) {
                itemsToAdd.get(itemsToAdd.indexOf(item)).setQuantity(itemsToAdd.get(itemsToAdd.indexOf(item)).getQuantity() - 1);
                int quantity = item.getQuantity();
                if(quantity<=0)
                {
                    item.isAvailable = false;
                    System.out.println("Item " + item.getName() + " is out of stock.");
                    continue;
                }
                finalCart.add(item);

            } else {
                System.out.println("Item " + item.getName() + " is not available in the menu.");
            }
        }
        orderRepository.addCart(user, finalCart , restaurent);
    }
    
    public void removeCart(User user, List<Item> items , Restaurent restaurent) {
        OrderRepository orderRepository = new OrderRepository();
        Menu menu = orderRepository.getMenu(restaurent);
        List<Item> itemsToAdd = menu.getItems();
        //  System.out.println("Removing items from cart...");
        //  for(Item item : itemsToAdd) {
        //      System.out.println("- " + item.getName());
        //  }
        // decremnt the quantity of the items in the menu
        // add the items to the cart
        List<Item>finalCart = new ArrayList<>();
        for(Item item : itemsToAdd) {
            if(items.contains(item)) {
                itemsToAdd.get(itemsToAdd.indexOf(item)).setQuantity(itemsToAdd.get(itemsToAdd.indexOf(item)).getQuantity() + 1);
                finalCart.remove(item);
            } else {
                finalCart.add(item);
            }
        }
        // for(Item item : finalCart) {
        //      System.out.println("- " + item.getName());
        //  }
        orderRepository.addCart(user, finalCart , restaurent);
    }

    public void viewOrder(User user)
    {
        OrderRepository orderRepository = new OrderRepository();
        Cart cart = user.getCart();
        if(cart == null) {
            System.out.println("No items in the cart.");
        }
        System.out.println("Items in the cart:");
        List<Item> IteamsInCart = (List<Item>) orderRepository.viewOrder(user);
        int calculateTotal = 0;
        for (Item item : IteamsInCart) {
            calculateTotal += item.getPrice();
            System.out.println("- " + item.getName() + " (" + item.getType() + ") - Rs." + item.getPrice());
        }
        System.out.println("Total price: Rs." + calculateTotal);
        System.out.println("Restaurent: " + cart.getRestaurent().getName());
        System.out.println("Ordered_by : "+ user.getName());
        
    }

    public int totalAmount(User user) {
        OrderRepository orderRepository = new OrderRepository();
        Cart cart = user.getCart();
        if(cart == null) {
            System.out.println("No items in the cart.");
        }
        List<Item> IteamsInCart = (List<Item>) orderRepository.viewOrder(user);
        int calculateTotal = 0;
        for (Item item : IteamsInCart) {
            calculateTotal += item.getPrice();
        }
        System.out.println("Total price: Rs." + calculateTotal);
        return calculateTotal;

    }
}
