package Model.Veterinarians;

import Model.Animals.Animal;

public abstract class Veterinarian {
    private String name;
    private String specialization;

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
