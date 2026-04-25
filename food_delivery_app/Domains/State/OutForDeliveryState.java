package food_delivery_app.Domains.State;

public class OutForDeliveryState implements OrderState {

    private Order order;

    public OutForDeliveryState(Order order) {
        this.order = order;
    }

    @Override
    public void inCart() {
        System.out.println("[OutForDeliveryState] Cannot go back to cart.");
    }

    @Override
    public void placed() {
        System.out.println("[OutForDeliveryState] Cannot go back to placed.");
    }

    @Override
    public void preparing() {
        System.out.println("[OutForDeliveryState] Cannot go back to preparing.");
    }

    @Override
    public void outForDelivery() {
        System.out.println("[OutForDeliveryState] Order is already out for delivery.");
    }

    @Override
    public void delivered() {
        System.out.println("[OutForDeliveryState] Order delivered successfully!");
        order.setState(order.getDeliveredState());
    }
}
