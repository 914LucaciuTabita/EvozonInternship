package Model.Veterinarians;

import Model.Animals.Animal;

public class GeneralVeterinarian extends Veterinarian {
    public GeneralVeterinarian(String name, String specialization) {
        super(name, "General");
    }

    @Override
    public void introduce() {
        super.introduce();
    }

    @Override
    public void checkHealth(Animal animal) {
        if (animal.getMoodLvl() > 1) {
            animal.setMoodLvl(animal.getMoodLvl() - 1);
        }

        System.out.println(getName() + " is doing a general health check-up for " + animal.getName() + ":");
        System.out.println("Health Level: " + animal.getHealthLvl());
        System.out.println("Heart rate: " + animal.getHeartRate());
        System.out.println("Temperature: " + animal.getTemperature());
        System.out.println();
    }

    @Override
    public void treat(Animal animal) {
        int oldHealthLvl = animal.getHealthLvl();
        if (animal.getMoodLvl() > 2) {
            animal.setMoodLvl(animal.getMoodLvl() - 2);
        }
        if (animal.getHealthLvl() < 5){
            animal.setHealthLvl(animal.getHealthLvl() + 2);
            System.out.println(getName() + " is treating " + animal.getName() + ". Health level: " + oldHealthLvl + " -> " + animal.getHealthLvl() + "\n");
        }
    }
}
