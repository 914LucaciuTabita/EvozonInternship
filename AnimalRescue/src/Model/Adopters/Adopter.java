package Model.Adopters;

import Model.AnimalFood.AnimalFood;
import Model.AnimalFood.LowCalorieFood;
import Model.AnimalShelter;
import Model.Animals.Animal;
import Model.Animals.Dog;
import Model.Veterinarians.Veterinarian;

public class Adopter {
    private String name;
    private int age;
    private double availableMoney;
    private AnimalShelter animalShelter;

    public Adopter(String name, int age, double availableMoney, AnimalShelter animalShelter) {
        this.name = name;
        this.age = age;
        this.availableMoney = availableMoney;
        this.animalShelter = animalShelter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public AnimalShelter getAnimalShelter() {
        return animalShelter;
    }

    public void setAnimalShelter(AnimalShelter animalShelter) {
        this.animalShelter = animalShelter;
    }

    public void adoptAnimal(Animal animal, String animalName) {
        animal.setName(animalName);
        System.out.println(name + " adopted " + animal.getName() + " from the animal shelter!");
    }

    public void feedAnimal(Animal animal, AnimalFood food, double quantity) {
        int oldHungerLvl = animal.getHungerLvl();
        int oldHealthLvl = animal.getHealthLvl();
        if (food.getQuantity() >= quantity) {
            if (animal.getFavFood().equalsIgnoreCase(food.getName())) {
                if(animal.getHungerLvl() > 5){
                    animal.setHungerLvl(animal.getHungerLvl() - 5);
                } else {
                    animal.setHungerLvl(1);
                }
                System.out.println(name + " fed " + animal.getName() + " with " + food.getName() + ".\nHunger level: " + oldHungerLvl + " -> " + animal.getHungerLvl());
            } else {
                System.out.println(name + " tried to feed " + animal.getName() + " with " + food.getName() + ", but it's not its favorite food.");
            }
            if (food instanceof LowCalorieFood) {
                LowCalorieFood lowCalorieFood = (LowCalorieFood) food;
                animal.setHealthLvl(animal.getHealthLvl() + 1);
                System.out.println("This is a low-calorie food with calorie content: " +
                        lowCalorieFood.getCalorieContent() + " kcal which will increase " + animal.getName() + "'s health. Health level: " + oldHealthLvl + " -> " + animal.getHealthLvl());
            }
        }
        food.useFood(quantity);
    }

    public void walkAnimal(Dog animal) {
        System.out.println(name + " takes " + animal.getName() + " for a walk.");
        animal.walk();
    }

    public void takeAnimalToVeterinarian(Animal animal, Veterinarian veterinarian) {
        System.out.println(name + " takes " + animal.getName() + " to veterinarian.");
    }
}
