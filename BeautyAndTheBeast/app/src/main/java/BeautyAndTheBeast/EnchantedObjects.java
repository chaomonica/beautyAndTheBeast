package BeautyAndTheBeast;

public class EnchantedObjects {
    public String name;
    public String power;
    public Location location;

    // mirror

    public EnchantedObjects(String name, String power, Location location) {
        this.name = name;
        this.power = power;
    }
}

// ----------------------------------------------------------------//
class Rose extends EnchantedObjects {
    public int petals = 5;

    public Rose(String name, String power, Location location) {
        super(name, power, location);
        System.out.println("An enchanted rose was created");
    }

    public int getPetals() {
        return petals;
    }

    public void decreasePetals() {
        petals--;
        System.out.println("The rose has lost a petal. The rose now has " + getPetals() + " petals");
    }
}