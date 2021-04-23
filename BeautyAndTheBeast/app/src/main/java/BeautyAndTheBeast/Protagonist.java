package BeautyAndTheBeast;

class Protagonist extends Character {
    public String outfit;
    private int happiness;
    public boolean isCursed;
    public boolean isInLove = false;

    public Protagonist(String name, int happiness, String outfit, boolean isCursed) {
        super(name);
        this.outfit = outfit;
        this.happiness = happiness;
        this.isCursed = isCursed;
    }

    public int getHappiness() {
        return happiness;
    }

    public void increaseHappiness() {
        this.happiness++;
        System.out.printf("%s's happiness has increased%n", this.name);
    }

    public void decreaseHappiness() {
        this.happiness--;
    }

    public void castCurse() {
        this.isCursed = true;
        System.out.printf("%s has been cursed!%n", this.name);
    }

    public void liftCurse() {
        this.isCursed = false;
        System.out.printf("%s curse has been lifted!%n", this.name);
    }

    public void fallInLove() {
        this.isInLove = true;
        System.out.printf("%s has fallen in love%n", this.name);
    }
}
