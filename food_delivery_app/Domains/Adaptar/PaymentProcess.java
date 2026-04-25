package food_delivery_app.Domains.Adaptar;
import food_delivery_app.Domains.User;

public interface PaymentProcess {
    void makePayment(User user, int totalAmount, String paymentMethod);
}
