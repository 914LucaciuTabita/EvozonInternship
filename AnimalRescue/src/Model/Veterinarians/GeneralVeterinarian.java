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
        System.out.println(blueColorCode + "Health Level: " + resetColorCode + animal.getHealthLvl());
        System.out.println(blueColorCode +  "Heart rate: " + resetColorCode + animal.getHeartRate());
        System.out.println(blueColorCode + "Temperature: " + resetColorCode + animal.getTemperature());
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
            System.out.println(getName() + " is treating " + animal.getName() + ". Health level: " + "increased from " + oldHealthLvl + " to " + animal.getHealthLvl() + "\n");
        }
    }
}
