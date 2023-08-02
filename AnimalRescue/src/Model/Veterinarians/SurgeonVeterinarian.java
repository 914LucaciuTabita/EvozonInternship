package Model.Veterinarians;

import Model.Animals.Animal;

public abstract class SurgeonVeterinarian extends Veterinarian {
    public SurgeonVeterinarian(String name, String specialization) {
        super(name, "Surgeon");
    }

    @Override
    public void checkHealth(Animal animal) {
        System.out.println(getName() + " is performing a surgery on " + animal.getName());
    }
}
