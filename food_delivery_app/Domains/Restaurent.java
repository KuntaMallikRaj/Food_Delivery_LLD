package food_delivery_app.Domains;

import java.util.List;
import food_delivery_app.Domains.Location;

public class Restaurent {
public String name;
public String location;
public int ID;
public Menu menu;
public Restaurent(String name, Location loc ,Menu menu) {
    this.name = name;
    this.location = loc.getAddress();
    this.ID = 0;
    this.menu = menu;
}

public Restaurent(String name, String location, int ID) {
    this.name = name;
    this.location = location;
    this.ID = ID;
}
//getters and setters
public String getName() {
    return name;    
}
public void setName(String name) {
    this.name = name;
}
public String getLocation() {
    return location;
}
public void setLocation(String location) {
    this.location = location;
}
public int getID() {
    return ID;
}
public void setID(int ID) {
    this.ID = ID;
}
public Menu getMenu() {
    return menu;    
}
}
