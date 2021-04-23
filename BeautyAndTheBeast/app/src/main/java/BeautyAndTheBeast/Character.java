package BeautyAndTheBeast;

public class Character {
  public String name;

  public Character(String name) {
    this.name = name;
  }

}

class Servant extends Character {
  public String type;

  public Servant(String name, String type) {
    super(name);
    this.type = type;
  }
}

class Protagonist extends Character {
  public String outfit;
  private int happiness;
  public boolean isCursed;
  public boolean isInLove;

  // pass in outfit type and isCursed instead of separate constructors***, move
  // protagonist into separate file
  // Belle
  public Protagonist(String name, int happiness) {
    super(name);
    this.outfit = "Blue Dress";
    this.happiness = happiness;
    this.isCursed = false;
    this.isInLove = false;
  }

  // Beast
  public Protagonist(String name) {
    super(name);
    this.outfit = "Cloak";
    this.happiness = 0;
    this.isCursed = true;
    this.isInLove = false;
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

class Villian extends Character {
  public Villian(String name) {
    super(name);
  }
}