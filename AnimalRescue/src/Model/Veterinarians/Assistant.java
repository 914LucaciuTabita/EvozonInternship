package Model.Veterinarians;

import Model.Animals.Animal;

public class Assistant {
    private String name;

    public Assistant(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello, I'm assistant. " + name);
    }

    public void comfortAnimal(Animal animal) {
        if (animal.getMoodLvl() < 10) {
            animal.setMoodLvl(animal.getMoodLvl() + 1);
        }
    }
}
