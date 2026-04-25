package food_delivery_app.Domains.State;

public class DeliveredState implements OrderState {
    private Order order;
    public DeliveredState(Order order) { this.order = order; }

    public void inCart()         { System.out.println("Order already delivered."); }
    public void placed()         { System.out.println("Order already delivered."); }
    public void preparing()      { System.out.println("Order already delivered."); }
    public void outForDelivery() { System.out.println("Order already delivered."); }
    public void delivered()      { System.out.println("Order has been delivered!"); }
}
