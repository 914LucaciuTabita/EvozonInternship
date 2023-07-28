import Model.*;
import Model.Adopters.Adopter;
import Model.Adopters.Girl;
import Model.AnimalFood.AnimalFood;
import Model.AnimalFood.LowCalorieFood;
import Model.Animals.*;
import Model.Veterinarians.Assistant;
import Model.Veterinarians.GeneralVeterinarian;
import Model.Veterinarians.Veterinarian;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Create an animal shelter
        AnimalShelter animalShelter = new AnimalShelter();

        // Create a girl and her father
        Girl girl = new Girl("Emily", 7, 100, animalShelter, "red hair");
        Adopter father = new Adopter("John", 35, 500, animalShelter);

        // Add some animals to the animal shelter
        Dog dog = new Poodle("Poodle", 3, 4, 5, 3, "Poodle Food", "Fetch", "white");
        animalShelter.addAnimal(dog);

        // Girl and her father visit the animal shelter to adopt a pet
//        father.adoptAnimal(dog, "Max");
        System.out.println("One day, a little " + girl.getAge() + "-year-old girl with " + girl.getHairColor() +
                " and a love for animals entered an animal shelter together with her tall father to adopt a pet.\n" +
                "The girl fell in love with a dog, which was a Labrador mix. \nThe dog was very unhappy, thin, and " +
                "refused to eat. ");
        girl.adoptAnimal(dog, "Max");

        System.out.println("\nAt the beginning, the dog was very scared. ");

        // Feed the pet
        AnimalFood poodleFood = new AnimalFood("Poodle Food", 10, 10, LocalDate.of(2024, 1, 1), true);
        girl.feedAnimal(dog, poodleFood, 3);

        System.out.println("\nAfter some time, the dog, who was a few years old, started gaining weight and became more energetic. ");


        // Play with the pet
        RecreationActivity playActivity = new RecreationActivity("playing fetch");
        playActivity.performActivity(dog);

        // Take the pet to the veterinarian for check-up
        Veterinarian veterinarian = new GeneralVeterinarian("Dr. Smith", "General");
        girl.takeAnimalToVeterinarian(dog, veterinarian);

        veterinarian.checkHealth(dog);
        veterinarian.treat(dog);


        // Comfort the pet during the treatment
        Assistant assistant = new Assistant("Anna");
        assistant.comfortAnimal(dog);

        assistant.comfortAnimal(dog);

        System.out.println("After feeding the dog with wet food for some time, he gained weight, so the girl had to switch his diet to a special low-calorie food for dogs.");

        System.out.println("In the morning");

        // Change the pet's food to low-calorie food
        LowCalorieFood lowCalorieFood = new LowCalorieFood("Low-Calorie Food", 12, 5, LocalDate.of(2024, 1, 1), true, 100);
        girl.feedAnimal(dog, lowCalorieFood, 3);

        // Walk the pet
        girl.walkAnimal(dog);

        // End of the day, the pet goes to sleep
        dog.sleep();

        // Emily is doing her homework
        girl.doHomework();

        // Max wakes up
        dog.wakeup();

        // Emily plays with Max
        dog.play();

        dog.walk();
        girl.feedAnimal(dog, lowCalorieFood, 0.2);
        dog.sleep();

        // Check the pet's current state
        System.out.println("Current state of " + dog.getName() + ":");
        System.out.println("Health Level: " + dog.getHealthLvl());
        System.out.println("Hunger Level: " + dog.getHungerLvl());
        System.out.println("Mood Level: " + dog.getMoodLvl());
    }
}