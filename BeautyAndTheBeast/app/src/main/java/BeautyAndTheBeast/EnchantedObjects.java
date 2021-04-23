package BeautyAndTheBeast;

public class EnchantedObjects {
    public String name;
    public String power;
    public String location;

    // mirror

    public EnchantedObjects(String name, String power, String location) {
        this.name = name;
        this.power = power;
    }
}

class Rose extends EnchantedObjects {
    public int petals = 5;

    public Rose(String name, String power, String location) {
        super(name, power, location);
    }

    public int getPetals() {
        return petals;
    }

    public void decreasePetals() {
        petals--;
    }
}