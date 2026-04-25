package food_delivery_app.Domains.State;

public class Order {

    private OrderState cartState;
    private OrderState placedState;
    private OrderState preparingState;
    private OrderState outForDeliveryState;
    private OrderState deliveredState;

    private OrderState currentState;

    public Order() {
        cartState = new CartState(this);
        placedState = new PlacedState(this);
        preparingState = new PreparingState(this);
        outForDeliveryState = new OutForDeliveryState(this);
        deliveredState = new DeliveredState(this);

        currentState = cartState;
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void inCart()         { currentState.inCart(); }
    public void placed()         { currentState.placed(); }
    public void preparing()      { currentState.preparing(); }
    public void outForDelivery() { currentState.outForDelivery(); }
    public void delivered()      { currentState.delivered(); }

    public OrderState getCartState()           { return cartState; }
    public OrderState getPlacedState()         { return placedState; }
    public OrderState getPreparingState()      { return preparingState; }
    public OrderState getOutForDeliveryState() { return outForDeliveryState; }
    public OrderState getDeliveredState()      { return deliveredState; }
}
