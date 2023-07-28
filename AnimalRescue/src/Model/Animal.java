package Model;

public class Animal {
    private String name;
    private int age;
    private int healthLvl;
    private int hungerLvl;
    private int moodLvl;
    private String favFood;
    private String favActivity;

    public Animal(String name, int age, int healthLvl, int hungerLvl, int moodLvl, String favFood, String favActivity) {
        this.name = name;
        this.age = age;
        this.healthLvl = healthLvl;
        this.hungerLvl = hungerLvl;
        this.moodLvl = moodLvl;
        this.favFood = favFood;
        this.favActivity = favActivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLvl() {
        return healthLvl;
    }

    public void setHealthLvl(int healthLvl) {
        this.healthLvl = healthLvl;
    }

    public int getHungerLvl() {
        return hungerLvl;
    }

    public void setHungerLvl(int hungerLvl) {
        this.hungerLvl = hungerLvl;
    }

    public int getMoodLvl() {
        return moodLvl;
    }

    public void setMoodLvl(int moodLvl) {
        this.moodLvl = moodLvl;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getFavActivity() {
        return favActivity;
    }

    public void setFavActivity(String favActivity) {
        this.favActivity = favActivity;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healthLvl=" + healthLvl +
                ", hungerLvl=" + hungerLvl +
                ", moodLvl=" + moodLvl +
                ", favFood='" + favFood + '\'' +
                ", favActivity='" + favActivity + '\'' +
                '}';
    }
}

