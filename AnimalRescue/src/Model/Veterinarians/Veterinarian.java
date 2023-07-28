package Model.Veterinarians;

import Model.Animals.Animal;

public abstract class Veterinarian {
    private String name;
    private String specialization;

    // ANSI escape code for pink text
    String pinkColorCode = "\u001B[35m";
    // ANSI escape code for blue text
    String blueColorCode = "\u001B[34m";
    // ANSI escape code to reset text color to default
    String resetColorCode = "\u001B[0m";

    public Veterinarian(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void introduce() {
        System.out.println("Hello, I'm Dr. " + getName() + ", a " + getSpecialization() + " veterinarian.");
    }

    public abstract void checkHealth(Animal animal);

    public abstract void treat(Animal animal);
}
