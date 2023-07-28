package Model.Animals;

public class Cat extends Animal {
    public Cat(String name, int age, int healthLvl, int hungerLvl, int moodLvl, String favFood, String favActivity) {
        super(name, age, healthLvl, hungerLvl, moodLvl, favFood, favActivity);
    }

    public void meow() {
        System.out.println(getName() + " is meowing!");
    }

    @Override
    public void sleep() {
        int oldMoodLvl = getMoodLvl();
        if (getMoodLvl() <= 9) {
            setMoodLvl(getMoodLvl() + 1);
        } else { setMoodLvl(10); }

        System.out.println(getName() + " is sleeping peacefully.\n" + "Mood level: " + oldMoodLvl + " -> " + getMoodLvl() + "\n");
    }

    @Override
    public void play() {
        int oldMoodLvl = getMoodLvl();
        int oldHungerLvl = getHungerLvl();
        if (getMoodLvl() <= 9) {
            setMoodLvl(getMoodLvl() + 1);
        } else { setMoodLvl(10); }

        if (getHungerLvl() > 2) {
            setHungerLvl(getHungerLvl() - 2);
        } else { setHungerLvl(1); }

        System.out.println(getName() + " is playing " + getFavActivity() + ".\n" + "Mood level: " + oldMoodLvl + " -> " + getMoodLvl() + "\nHunger level: " + oldHungerLvl + " -> " + getHungerLvl() + "\n");
    }

    @Override
    public void wakeup() {
        System.out.println(getName() + "woke up.\n");
    }
}
