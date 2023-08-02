package Model.Animals;

public class Poodle extends Dog {
    private String furColor;

    public Poodle(String name, int age, int healthLvl, int hungerLvl, int moodLvl, String favFood, String favActivity, String furColor) {
        super(name, age, healthLvl, hungerLvl, moodLvl, favFood, favActivity);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void dance() {
        System.out.println(getName() + " is dancing elegantly!");
    }

    @Override
    public void bark() {
        System.out.println(getName() + " is barking gently!");
    }
}
