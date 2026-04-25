package food_delivery_app.Domains.Strategy;
import food_delivery_app.Domains.Reciept;

public class MPNStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(Reciept receipt) {
        // Logic to send notification using MPN (Mobile Push Notification)
        System.out.println("Sending notification via Mobile push notification for receipt: " + receipt.getUser().getName());
    }
    
}
