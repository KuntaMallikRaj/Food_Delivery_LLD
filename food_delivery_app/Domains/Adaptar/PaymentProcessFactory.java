package food_delivery_app.Domains.Adaptar;
import food_delivery_app.Domains.User;

public class PaymentProcessFactory {

    public static PaymentProcess getPaymentProcess(String paymentMethod) {
        switch (paymentMethod.toLowerCase()) {
            case "credit card":
            case "creditcard":  return new CreditCartPayment();
            case "upi":         return new UPIPayment();
            case "net banking": return new NetBankingPayment();
            default: throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
        }
    }
}
