package food_delivery_app.Domains;

import java.util.List;
import java.util.ArrayList;

public class Location {
    public String address;
    public double latitude;
    public double longitude;
    public List<Restaurent> nearbyRestaurants;

    public Location(String address) {
        this.address = address;
        this.latitude = 0;
        this.longitude = 0;
        this.nearbyRestaurants = new ArrayList<>();
    }

    public Location(String address, double latitude, double longitude, List<Restaurent> nearbyRestaurants) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.nearbyRestaurants = nearbyRestaurants;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }
    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }
    public List<Restaurent> getNearbyRestaurants() { return nearbyRestaurants; }
    public void setNearbyRestaurants(List<Restaurent> nearbyRestaurants) { this.nearbyRestaurants = nearbyRestaurants; }
}
