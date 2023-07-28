package Model.Animals;

public abstract class Animal {
    private String name;
    private int age;
    private int healthLvl;
    private int hungerLvl;
    private int moodLvl;
    private String favFood;
    private String favActivity;
    private int heartRate = 60;
    private int temperature = 36;

    public Animal(String name, int age, int healthLvl, int hungerLvl, int moodLvl, String favFood, String favActivity) {
        this.name = name;
        this.age = age;
        this.healthLvl = healthLvl;
        this.hungerLvl = hungerLvl;
        this.moodLvl = moodLvl;
        this.favFood = favFood;
        this.favActivity = favActivity;
    }

    public Animal(String name, int age, int healthLvl, int hungerLvl, int moodLvl, String favFood, String favActivity, int heartRate, int temperature) {
        this.name = name;
        this.age = age;
        this.healthLvl = healthLvl;
        this.hungerLvl = hungerLvl;
        this.moodLvl = moodLvl;
        this.favFood = favFood;
        this.favActivity = favActivity;
        this.heartRate = heartRate;
        this.temperature = temperature;
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

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public abstract void sleep();

    public abstract void wakeup();

    public abstract void play();
}

