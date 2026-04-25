package food_delivery_app.Domains.Strategy;
import food_delivery_app.Domains.Reciept;

public class APSStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(Reciept receipt) {
        // Logic to send notification using APS (Apple Push Service)
        System.out.println("Sending notification via Apple push service for receipt: " + receipt.getUser().getName());
    }
    
}
