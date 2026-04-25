package food_delivery_app.Domains.Adaptar;
import food_delivery_app.Domains.User;

public class NetBankingPayment implements PaymentProcess {
    @Override
    public void makePayment(User user, int totalAmount, String paymentMethod) {
        // System.out.println("Processing net banking payment for " + user.getName() + "...");
        // Simulate net banking payment processing logic here
        System.out.println("Payment of Rs." + totalAmount + " using " + paymentMethod + " was successful!");
    }
}
