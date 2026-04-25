package food_delivery_app.Domains.State;

public class CartState implements OrderState {
    private Order order;
    public CartState(Order order) { this.order = order; }

    public void inCart()         { System.out.println("Order is in cart."); }
    public void placed()         { System.out.println("Order placed!"); order.setState(order.getPlacedState()); }
    public void preparing()      { System.out.println("Cannot prepare before placing."); }
    public void outForDelivery() { System.out.println("Cannot deliver before placing."); }
    public void delivered()      { System.out.println("Cannot deliver before placing."); }
}
