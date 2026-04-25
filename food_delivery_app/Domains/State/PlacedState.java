package food_delivery_app.Domains.State;

public class PlacedState implements OrderState {

    private Order order;

    public PlacedState(Order order) {
        this.order = order;
    }

    @Override
    public void inCart() {
        System.out.println("[PlacedState] Order is already placed, cannot go back to cart.");
    }

    @Override
    public void placed() {
        System.out.println("[PlacedState] Order is already placed.");
    }

    @Override
    public void preparing() {
        System.out.println("[PlacedState] Restaurant started preparing the order.");
        order.setState(order.getPreparingState());
    }

    @Override
    public void outForDelivery() {
        System.out.println("[PlacedState] Cannot go out for delivery before preparing.");
    }

    @Override
    public void delivered() {
        System.out.println("[PlacedState] Cannot deliver before preparing.");
    }
}
