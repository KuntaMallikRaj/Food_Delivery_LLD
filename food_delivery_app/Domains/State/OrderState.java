package food_delivery_app.Domains.State;

public interface OrderState {
    public void inCart();
    public void placed();
    public void preparing();
    public void outForDelivery();
    public void delivered();
}
