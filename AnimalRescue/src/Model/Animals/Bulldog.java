package Model.Animals;

public class Bulldog extends Dog {
    private boolean hasWrinkles;

    public Bulldog(String name, int age, int healthLvl, int hungerLvl, int moodLvl, String favFood, String favActivity, boolean hasWrinkles) {
        super(name, age, healthLvl, hungerLvl, moodLvl, favFood, favActivity);
        this.hasWrinkles = hasWrinkles;
    }

    public boolean isHasWrinkles() {
        return hasWrinkles;
    }

    public void setHasWrinkles(boolean hasWrinkles) {
        this.hasWrinkles = hasWrinkles;
    }

    public void snore() {
        System.out.println(getName() + " is snoring loudly!");
    }

    @Override
    public void bark() {
        System.out.println(getName() + " is barking aggressively!");
    }
}
