package food_delivery_app.Main;

import java.util.Arrays;
import java.util.List;

import food_delivery_app.Controllers.*;
import food_delivery_app.Domains.*;





public class main {
    public static void main(String[] args) {
        //code to run the application
        // adding restaurents to the database
        User user = new User("Mallikraj", "1234567890", 1, null);
        Location location1 = new Location("hyderabad" );
        Item item1 = new Item("Biryani", "NON-vegetarian", 200, true, 10);
        Item item2 = new Item("Chicken 65", "NON-vegetarian", 150, true, 20);
        Item item3 = new Item("Paneer Butter Masala", "vegetarian", 250, true, 15);
        Restaurent restaurent1 = new Restaurent("Bawarchi", location1, null);
        Menu menu1 = new Menu(Arrays.asList(item1, item2, item3), restaurent1);
        restaurent1 = new Restaurent("Bawarchi", location1, menu1);
        Restaurent restaurent2 = new Restaurent("Paradise", location1, menu1);
        

        OrderController orderController = new OrderController();
        orderController.addRestaurent(restaurent1, location1);
        orderController.addRestaurent(restaurent2, location1);
        orderController.chooseRestaurent(user, location1);

        // listing menu of the restaurent
        orderController.listMenu(restaurent1);

        //add to cart
        List<Item> iteamsSelected = Arrays.asList(item1, item3,item2);
        orderController.addToCart(user, iteamsSelected , restaurent1);
        System.out.println("Cart after adding items:");
        orderController.viewCart(user);

        
        //removing from cart
        List<Item> iteamsRemoved = Arrays.asList(item2);
        orderController.removeFromCart(user, iteamsRemoved , restaurent1);
        System.out.println("Cart after removing item:");
        orderController.viewCart(user);

        //total amount
        int totalAmount = orderController.totalAmount(user);
        System.out.println("Total amount: Rs." + totalAmount);

        System.out.println("Final Cart:");
        orderController.viewCart(user);


        // payment process - no cash on delivery
            PaymentController paymentController = new PaymentController();
            paymentController.makePayment(user, totalAmount, "upi");
        


    }
}

