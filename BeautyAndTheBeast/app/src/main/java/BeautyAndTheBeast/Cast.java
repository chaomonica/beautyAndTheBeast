package BeautyAndTheBeast;

import java.util.ArrayList;

public class Cast {
  public static ArrayList<Character> cast = new ArrayList<Character>();
  public static Protagonist belle;
  public static Protagonist beast;
  public static Servant lumiere;
  public static Servant cogsworth;
  public static Servant mrsPotts;
  public static Servant chip;

  public static void createCast() {
    belle = new Protagonist("Belle", 90, "blue dress", false);
    beast = new Protagonist("Beast", 0, "cloak", false);
    cast.add(belle);
    cast.add(beast);

    lumiere = new Servant("Lumiere", "Candelabra");
    cogsworth = new Servant("Cogsworth", "Clock");
    mrsPotts = new Servant("Mrs. Potts", "Tea Pot");
    chip = new Servant("Chip", "Cup");
    cast.add(lumiere);
    cast.add(cogsworth);
    cast.add(mrsPotts);
    cast.add(chip);
  }

  public static void printCast() {
    for (int i = 0; i < cast.size(); i++) {
      System.out.println(cast.get(i).name);
    }
    // System.out.println(cast.toString());

  }
}
