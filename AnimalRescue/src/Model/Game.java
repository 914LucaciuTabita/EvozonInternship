package Model;

import Model.Adopters.Adopter;
import Model.Animals.Dog;
import Model.Veterinarians.Veterinarian;

public class Game {
    private Adopter adopter;
    private Dog dog;
    private Veterinarian veterinarian;

    public Game(Adopter adopter, Dog dog, Veterinarian veterinarian) {
        this.adopter = adopter;
        this.dog = dog;
        this.veterinarian = veterinarian;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }
}
