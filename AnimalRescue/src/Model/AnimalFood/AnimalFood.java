package Model.AnimalFood;

import java.time.LocalDate;

public class AnimalFood {
    private String name;
    private double price;
    private double quantity;
    private LocalDate expirationDate;
    private boolean availableInStock;

    // ANSI escape code for pink text
    String pinkColorCode = "\u001B[35m";
    // ANSI escape code for blue text
    String blueColorCode = "\u001B[34m";
    // ANSI escape code to reset text color to default
    String resetColorCode = "\u001B[0m";

    public AnimalFood(String name, double price, double quantity, LocalDate expirationDate, boolean availableInStock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.availableInStock = availableInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isAvailableInStock() {
        return availableInStock;
    }

    public void setAvailableInStock(boolean availableInStock) {
        this.availableInStock = availableInStock;
    }

    public void checkExpiryStatus() {
        LocalDate currentDate = LocalDate.now();
        if (expirationDate.isBefore(currentDate)) {
            availableInStock = false;
            System.out.println(name + " has expired and is no longer available in stock(" + expirationDate + ").");
        }  else if (expirationDate.isEqual(currentDate)) {
            System.out.println(name + " expires today(" + expirationDate + ").");
        } else {
            System.out.println(name + " is still within the expiry date(" + expirationDate + ").");
        }
    }

    public void restockFood(double quantity) {
        this.quantity += quantity;
        availableInStock = true;
        System.out.println(name + " has been restocked. New quantity: " + this.quantity);
    }

    public boolean useFood(double quantityToUse) {
        if (quantity >= quantityToUse) {
            setQuantity(quantity - quantityToUse);
            System.out.println("Used " + quantityToUse + " kg of " + getName() + ". Remaining quantity: " + quantity + " kg.\n");
            return true;
        } else {
            System.out.println("Not enough " + getName() + " in stock. Available quantity: " + quantity + " kg.\n");
            return false;
        }
    }
}
