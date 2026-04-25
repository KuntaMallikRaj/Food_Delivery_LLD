package food_delivery_app.Repositories;
import food_delivery_app.Domains.User;

import food_delivery_app.Domains.Reciept;
import food_delivery_app.Domains.Strategy.APSStrategy;
import food_delivery_app.Domains.Strategy.MPNStrategy;
import food_delivery_app.Domains.Strategy.NotificationAdaptor;
import food_delivery_app.Domains.Strategy.NotifcationFactory;

import food_delivery_app.Domains.Reciept;
import food_delivery_app.Domains.Strategy.*;

public class PaymentRepository {
    
    public void sendReceipt(User user, int totalAmount, String paymentMethod) {
        // Simulate sending receipt logic here
        Reciept receipt = new Reciept(user, totalAmount, paymentMethod);
       
        //Implement logic to send receipt to the user (e.g., via email or in-app notification)
        NotifcationFactory notificationFactory = new NotifcationFactory();
        NotificationStrategy strategy = notificationFactory.getNotificationStrategy("APS"); // Example: using APS strategy
       strategy.sendNotification(receipt);
    }
}
