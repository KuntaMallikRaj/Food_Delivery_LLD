package food_delivery_app.Controllers;

import food_delivery_app.Services.PaymentService;
import java.util.Scanner;
import food_delivery_app.Domains.User;

public class PaymentController {
    private Scanner scanner = new Scanner(System.in);

    public void makePayment(User user, int totalAmount, String paymentMethod) {
       PaymentService paymentService = new PaymentService();
       paymentService.processPayment(user, totalAmount, paymentMethod);
       return;
    }
        
}
