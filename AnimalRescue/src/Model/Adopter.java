package Model;

public class Adopter {
    private String name;
    private double availableMoney;

    public Adopter(String name, double availableMoney) {
        this.name = name;
        this.availableMoney = availableMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }
}
