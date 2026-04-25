package food_delivery_app.Domains.Strategy;

public class NotifcationFactory {
    public static NotificationStrategy getNotificationStrategy(String type) {
        if (type.equalsIgnoreCase("APS")) {
            return new APSStrategy();
        } else if (type.equalsIgnoreCase("MPN")) {
            return new MPNStrategy();
        }
        throw new IllegalArgumentException("Unknown notification type: " + type);
    }
}
