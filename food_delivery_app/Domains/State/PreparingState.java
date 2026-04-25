package food_delivery_app.Domains.State;

public class PreparingState implements OrderState {

    private Order order;

    public PreparingState(Order order) {
        this.order = order;
    }

    @Override
    public void inCart() {
        System.out.println("[PreparingState] Cannot go back to cart while preparing.");
    }

    @Override
    public void placed() {
        System.out.println("[PreparingState] Order is already past placed state.");
    }

    @Override
    public void preparing() {
        System.out.println("[PreparingState] Order is already being prepared.");
    }

    @Override
    public void outForDelivery() {
        System.out.println("[PreparingState] Order picked up, now out for delivery.");
        order.setState(order.getOutForDeliveryState());
    }

    @Override
    public void delivered() {
        System.out.println("[PreparingState] Cannot deliver before going out for delivery.");
    }
}
