package Model;

import Model.Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    private List<Animal> animals;

    public AnimalShelter() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // Additional methods to manage animals in the shelter (if needed)
}
