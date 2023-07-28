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
//        AnimalShelter animalShelter = new AnimalShelter();
//
//        Girl girl = new Girl("Emily", 7, 200.0, animalShelter, "red hair");
//
//        // Add some animals to the animal shelter
//        Dog dog = new Dog("Max", 1, 4, 5, 3, "Puppy Food", "Fetch");
//        animalShelter.addAnimal(dog);
//
//        // Adopt a pet from the animal shelter and give it a name
//        girl.adoptAnimal(dog, "Max");
//
//        // Feed the pet with specific food
//        girl.feedAnimal(dog, "Puppy Food");
//
//        // Take the pet to the veterinarian
//        Veterinarian veterinarian = new GeneralVeterinarian("Dr. Smith", "General");
//        girl.takePetToVeterinarian(dog, veterinarian);
//
//        // Walk the pet
//        girl.walkPet(dog);
//
//
//        // Create an adopter
//        Adopter adopter = new Adopter("Tabitha", 200.0);
//
//        // Create a dog
//        Dog dog = new Dog("Max", 3, 8, 6, 7, "Steak", "Fetch");
//
//        // Create a cat
//        Cat cat = new Cat("Whiskers", 2, 7, 5, 8, "Tuna", "Chase a string");
//
//        // Create a fish
//        Fish fish = new Fish("Nemo", 1, 9, 5, 6, "Fish flakes", "Swim around");
//
//        // Call specific behaviors for each animal
//        dog.bark();
//        cat.meow();
//        fish.swim();
//        System.out.println();
//
//        // Call the common behaviors for all animals
//        dog.sleep();
//        cat.sleep();
//        fish.sleep();
//
//        dog.play();
//        cat.play();
//        fish.play();
//
//        Poodle poodle = new Poodle("Fluffy", 2, 9, 3, 8, "Chicken", "Dance", "White");
//        Bulldog bulldog = new Bulldog("Spike", 4, 7, 6, 6, "Beef", "Snore", true);
//
//        poodle.bark();
//        poodle.dance();
//        System.out.println(poodle.getName() + "'s fur color: " + poodle.getFurColor() + "\n");
//
//        bulldog.bark();
//        bulldog.snore();
//        System.out.println(bulldog.getName() + " has wrinkles: " + bulldog.isHasWrinkles() + "\n");
//
//
//        // Create an animal food
//        LocalDate expirationDate = LocalDate.of(2023, 12, 31);
//        AnimalFood food = new AnimalFood("Steak", 10.0, 5.0, expirationDate, true);
//
//        adopter.feedAnimal(cat, food, 5);
//        food.restockFood(13.7);
//        food.checkExpiryStatus();
//
//        // Create a recreation activity
//        RecreationActivity activity = new RecreationActivity("Fetch");
//
//        // Create a veterinarian
//        Veterinarian vet = new GeneralVeterinarian("Dr. Smith", "Dentistry");
//
//        // Create the game instance
//        Game game = new Game(adopter, dog, vet);

        // Perform actions in the game
//        System.out.println("Adopter name: " + game.getAdopter().getName());
//        System.out.println("Dog name: " + game.getDog().getName());
//        System.out.println("Veterinarian name: " + game.getVeterinarian().getName());
//        System.out.println("Favorite food of the dog: " + game.getDog().getFavFood());
//        System.out.println("Favorite activity of the dog: " + game.getDog().getFavActivity());
//        System.out.println("Available money of the adopter: " + game.getAdopter().getAvailableMoney());
//        System.out.println("Animal food name: " + food.getName());
//        System.out.println("Animal food price: " + food.getPrice());
//        System.out.println("Animal food quantity: " + food.getQuantity());
//        System.out.println("Animal food expiration date: " + food.getExpirationDate());
//        System.out.println("Is the animal food available in stock? " + food.isAvailableInStock());

}