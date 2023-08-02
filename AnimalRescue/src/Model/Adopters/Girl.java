package Model.Adopters;

import Model.AnimalShelter;
import Model.Animals.Animal;

public class Girl extends Adopter {
    private String hairColor;

    public Girl(String name, int age, double availableMoney, AnimalShelter animalShelter, String hairColor) {
        super(name, age, availableMoney, animalShelter);
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void doHomework() {
        System.out.println(getName() + " is doing her homework.\n");
    }
}
