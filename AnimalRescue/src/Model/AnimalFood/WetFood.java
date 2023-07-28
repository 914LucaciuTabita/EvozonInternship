package Model.AnimalFood;

import java.time.LocalDate;

public class WetFood extends AnimalFood {
    private String type;

    public WetFood(String name, double price, double quantity, LocalDate expirationDate, boolean availableInStock, String type) {
        super(name, price, quantity, expirationDate, availableInStock);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
