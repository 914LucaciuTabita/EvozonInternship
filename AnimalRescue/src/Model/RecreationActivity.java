package Model;

import Model.Animals.Animal;

public class RecreationActivity {
    private String name;

    public RecreationActivity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void performActivity(Animal animal) {
        System.out.println(animal.getName() + " is performing " + name + ".");
        int oldMoodLvl = animal.getMoodLvl();
        int oldHungerLvl = animal.getHungerLvl();
        if (animal.getMoodLvl() <= 8) {
            animal.setMoodLvl(animal.getMoodLvl() + 2);
        } else {
            animal.setMoodLvl(10);
        }
        if (animal.getHungerLvl() <= 8) {
            animal.setMoodLvl(animal.getMoodLvl() + 2);
        } else {
            animal.setMoodLvl(10);
        }
        System.out.println("Mood level: " + oldMoodLvl + " -> " + animal.getMoodLvl() + "\nHunger level: " + oldHungerLvl + " -> " + animal.getHungerLvl());
    }
}
