package food_delivery_app.Domains.Adaptar;

import food_delivery_app.Domains.User;
import food_delivery_app.Domains.User;

public class PaymentAdaptor {
    private PaymentProcess paymentProcess;
    
    public PaymentAdaptor(PaymentProcess paymentProcess) {
        this.paymentProcess = paymentProcess;
    }
    
    public void makePayment(User user, int totalAmount, String paymentMethod) {
        paymentProcess.makePayment(user, totalAmount, paymentMethod);
    }
    
}
