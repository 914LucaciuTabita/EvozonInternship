import Model.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Create an adopter
        Adopter adopter = new Adopter("Tabitha", 200.0);

        // Create a dog
        Dog dog = new Dog("Rex", 3, 8, 6, 7, "Steak", "Fetch");

        // Create an animal food
        LocalDate expirationDate = LocalDate.of(2023, 12, 31);
        AnimalFood food = new AnimalFood("Steak", 10.0, 5.0, expirationDate, true);

        // Create a recreation activity
        RecreationActivity activity = new RecreationActivity("Fetch");

        // Create a veterinarian
        Veterinarian vet = new Veterinarian("Dr. Smith", "Dentistry");

        // Create the game instance
        Game game = new Game(adopter, dog, vet);

        // Perform actions in the game
        System.out.println("Adopter name: " + game.getAdopter().getName());
        System.out.println("Dog name: " + game.getDog().getName());
        System.out.println("Veterinarian name: " + game.getVeterinarian().getName());
        System.out.println("Favorite food of the dog: " + game.getDog().getFavFood());
        System.out.println("Favorite activity of the dog: " + game.getDog().getFavActivity());
        System.out.println("Available money of the adopter: " + game.getAdopter().getAvailableMoney());
        System.out.println("Animal food name: " + food.getName());
        System.out.println("Animal food price: " + food.getPrice());
        System.out.println("Animal food quantity: " + food.getQuantity());
        System.out.println("Animal food expiration date: " + food.getExpirationDate());
        System.out.println("Is the animal food available in stock? " + food.isAvailableInStock());
    }
}