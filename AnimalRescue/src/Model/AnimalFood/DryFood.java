package Model.AnimalFood;

import java.time.LocalDate;

public class DryFood extends AnimalFood {
    private String flavor;

    public DryFood(String name, double price, double quantity, LocalDate expirationDate, boolean availableInStock, String flavor) {
        super(name, price, quantity, expirationDate, availableInStock);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
