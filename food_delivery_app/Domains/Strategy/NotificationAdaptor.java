package food_delivery_app.Domains.Strategy;
import food_delivery_app.Domains.Reciept;

public class NotificationAdaptor {
    private NotificationStrategy notificationStrategy;

    public NotificationAdaptor(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void sendNotification(Reciept receipt) {
        notificationStrategy.sendNotification(receipt);
    }
}
