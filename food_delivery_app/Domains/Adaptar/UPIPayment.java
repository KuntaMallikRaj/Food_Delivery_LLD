package food_delivery_app.Domains.Adaptar;
import food_delivery_app.Domains.User;

public class UPIPayment implements PaymentProcess {
    @Override
    public void makePayment(User user, int totalAmount, String paymentMethod) {
        // System.out.println("Processing UPI payment for " + user.getName() + "...");
        // Simulate UPI payment processing logic here
        System.out.println("Payment of Rs." + totalAmount + " using " + paymentMethod + " was successful!");
    }
    
}
