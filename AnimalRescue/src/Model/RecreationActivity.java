package Model;

import Model.Animals.Animal;

public class RecreationActivity {
    private String name;

    // ANSI escape code for pink text
    String pinkColorCode = "\u001B[35m";
    // ANSI escape code for blue text
    String blueColorCode = "\u001B[34m";
    // ANSI escape code to reset text color to default
    String resetColorCode = "\u001B[0m";

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
        System.out.println(blueColorCode + "Mood level: " + resetColorCode + "increased from " + oldMoodLvl + " to " +
                animal.getMoodLvl() + blueColorCode + "\nHunger level: " + resetColorCode + "increased from " + oldHungerLvl + " to " + animal.getHungerLvl());
    }
}
