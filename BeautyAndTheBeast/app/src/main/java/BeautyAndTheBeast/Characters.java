package BeautyAndTheBeast;

public class Characters {
  public String name;

  public Characters(String name) {
    this.name = name;
  }

}

class Servants extends Characters {
  public String type;

  public Servants(String name, String type) {
    super(name);
    this.type = type;
  }
}


class Protagonists extends Characters {
  public String outfit;
  private int happiness;
  public boolean isCursed;
  public boolean isInLove;

  //Belle
  public Protagonists(String name, int happiness) {
    super(name);
    this.outfit = "Blue Dress";
    this.happiness = happiness;
    this.isCursed = false;
    this.isInLove = false;
  }

  //Beast
  public Protagonists(String name) {
    super(name);
    this.outfit = "Cloak";
    this.happiness = 0;
    this.isCursed = true;
    this.isInLove = false;
  }

  public int getHappiness() {
    return happiness;
  }
}