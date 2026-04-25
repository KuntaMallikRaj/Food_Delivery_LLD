package food_delivery_app.Domains.Strategy;
import food_delivery_app.Domains.Reciept;

public interface NotificationStrategy {
    void sendNotification(Reciept receipt);
}
