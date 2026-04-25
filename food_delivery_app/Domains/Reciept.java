package food_delivery_app.Domains;

public class Reciept {
   private User user;
   private int totalAmount;
    private String paymentMethod;
    public Reciept(User user, int totalAmount, String paymentMethod) {
        this.user = user;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
    }
    //getters 
    public User getUser() {
        return user;
    }
}
