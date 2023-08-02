package Model.AnimalFood;

import java.time.LocalDate;

public class LowCalorieFood extends AnimalFood {
    private double calorieContent;

    public LowCalorieFood(String name, double price, double quantity, LocalDate expirationDate, boolean availableInStock, double calorieContent) {
        super(name, price, quantity, expirationDate, availableInStock);
        this.calorieContent = calorieContent;
    }

    public double getCalorieContent() {
        return calorieContent;
    }

    @Override
    public boolean useFood(double quantityToUse) {
        if (getQuantity() >= quantityToUse) {
            setQuantity(getQuantity() - quantityToUse);
            System.out.println("Used " + quantityToUse + " kg of " + getName() + ". Remaining quantity: " + getQuantity() + " kg.\n");
            return true;
        } else {
            System.out.println("Not enough " + getName() + " in stock. Available quantity: " + getQuantity() + " kg.\n");
            return false;
        }
    }
}
