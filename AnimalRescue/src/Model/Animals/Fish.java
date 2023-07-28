package Model.Animals;

public class Fish extends Animal {
    public Fish(String name, int age, int healthLvl, int hungerLvl, int moodLvl, String favFood, String favActivity) {
        super(name, age, healthLvl, hungerLvl, moodLvl, favFood, favActivity);
    }

    public void swim() {
        System.out.println(getName() + " is swimming!");
    }

    @Override
    public void sleep() {
        // Fish don't sleep, so we don't increase the mood level
        System.out.println(getName() + " doesn't sleep. Fishes are always awake and active.");
    }

    @Override
    public void play() {
        int oldMoodLvl = getMoodLvl();
        int oldHungerLvl = getHungerLvl();
        if (getMoodLvl() <= 9) {
            setMoodLvl(getMoodLvl() + 1);
        } else { setMoodLvl(10); }

        if (getHungerLvl() > 1) {
            setHungerLvl(getHungerLvl() - 1);
        } else { setHungerLvl(1); }

        System.out.println(getName() + " is playing with bubbles.\n" + "Mood level: " + oldMoodLvl + " -> " + getMoodLvl() + "\nHunger level: " + oldHungerLvl + " -> " + getHungerLvl() + "\n");
    }

    @Override
    public void wakeup() {
        System.out.println(getName() + "doesn't wake up because it doesn't sleep.\n");
    }
}
