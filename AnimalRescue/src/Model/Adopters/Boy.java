package Model.Adopters;

import Model.AnimalShelter;
import Model.Animals.Animal;

public class Boy extends Adopter {
    private String favoriteSport;

    public Boy(String name, int age, double availableMoney, AnimalShelter animalShelter, String favoriteSport) {
        super(name, age, availableMoney, animalShelter);
        this.favoriteSport = favoriteSport;
    }

    public String getFavoriteSport() {
        return favoriteSport;
    }

    public void setFavoriteSport(String favoriteSport) {
        this.favoriteSport = favoriteSport;
    }

    public void playSportWithAnimal(Animal animal) {
        System.out.println(getName() + " is playing " + favoriteSport + " with " + animal.getName());
        animal.setMoodLvl(animal.getMoodLvl() + 3);
    }

    public void doHomework() {
        System.out.println(getName() + " is doing her homework.\n");
    }
}
