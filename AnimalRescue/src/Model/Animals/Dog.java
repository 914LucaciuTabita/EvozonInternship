package Model.Animals;

public class Dog extends Animal {
    public Dog(String name, int age, int healthLvl, int hungerLvl, int moodLvl, String favFood, String favActivity) {
        super(name, age, healthLvl, hungerLvl, moodLvl, favFood, favActivity);
    }

    public void bark() {
        System.out.println(getName() + " is barking!");
    }

    @Override
    public void sleep() {
        int oldMoodLvl = getMoodLvl();
        if (getMoodLvl() <= 8) {
            setMoodLvl(getMoodLvl() + 2);
        } else { setMoodLvl(10); }

        System.out.println(getName() + " is sleeping.\n" + blueColorCode + "Mood level: " + resetColorCode + "increased from " +
                oldMoodLvl + " to " + getMoodLvl() + "\n");
    }

    @Override
    public void play() {
        int oldMoodLvl = getMoodLvl();
        int oldHungerLvl = getHungerLvl();
        if (getMoodLvl() <= 6) {
            setMoodLvl(getMoodLvl() + 4);
        } else { setMoodLvl(10); }

        if (getHungerLvl() <= 7) {
            setHungerLvl(getHungerLvl() + 3);
        } else { setHungerLvl(10); }

        System.out.println(getName() + " is playing " + getFavActivity() + ".\n" + blueColorCode + "Mood level: " +
                resetColorCode + "increased from " + oldMoodLvl + " to " + getMoodLvl() + blueColorCode + "\nHunger level: " +
                resetColorCode + "increased from " + oldHungerLvl + " to " + getHungerLvl() + "\n");
    }

    public void walk() {
        int oldMoodLvl = getMoodLvl();
        if (getMoodLvl() <= 8) {
            setMoodLvl(getMoodLvl() + 2);
        } else { setMoodLvl(10); }

        System.out.println(getName() + " is happy going for a walk.\n" + blueColorCode + "Mood level: " +
                resetColorCode + "increased from " + oldMoodLvl + " to " + getMoodLvl() + "\n");
    }

    @Override
    public void wakeup() {
        System.out.println(getName() + " woke up.\n");
    }
}
