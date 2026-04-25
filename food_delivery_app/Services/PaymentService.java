package food_delivery_app.Services;

import food_delivery_app.Domains.User;
import food_delivery_app.Domains.Adaptar.PaymentAdaptor;
import food_delivery_app.Domains.Adaptar.PaymentProcess;
import food_delivery_app.Domains.Adaptar.PaymentProcessFactory;
import food_delivery_app.Repositories.PaymentRepository;

import java.util.Scanner;

public class PaymentService {

    public void processPayment(User user, int totalAmount, String paymentMethod) {
        PaymentProcess paymentProcess = PaymentProcessFactory.getPaymentProcess(paymentMethod);
        PaymentAdaptor paymentAdaptor = new PaymentAdaptor(paymentProcess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to continue with the payment? (yes/no)");
        String confirmation = scanner.nextLine();
        System.out.println("Processing credit card payment for " + user.getName() + "...");

        if (confirmation.equalsIgnoreCase("yes")) {
            try{
                Thread.sleep(30000); // Simulate payment processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            paymentAdaptor.makePayment(user, totalAmount, paymentMethod);
            System.out.println("Payment successful! Thank you for your order, " + user.getName() + ".");
            // Simulate sending receipt logic here
            PaymentRepository paymentRepository = new PaymentRepository();
            paymentRepository.sendReceipt(user, totalAmount, paymentMethod);

        } else {
            System.out.println("Payment cancelled. Your order has not been placed.");
        }
    }
}
