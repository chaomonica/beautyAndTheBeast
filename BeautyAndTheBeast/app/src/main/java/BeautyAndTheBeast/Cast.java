package BeautyAndTheBeast;
import java.util.ArrayList;
import java.util.Arrays;

public class Cast {
  public static ArrayList<Characters> cast = new ArrayList<Characters>();

  public static void createCast() {
    Protagonists belle = new Protagonists("Belle", 90);
    Protagonists beast = new Protagonists("Beast");
    cast.add(belle);
    cast.add(beast);

    Servants lumiere = new Servants("Lumiere", "Candelabra");
    Servants cogsworth = new Servants("Cogsworth", "Clock");
    Servants mrsPotts = new Servants("Mrs. Potts", "Tea Pot");
    Servants chip = new Servants("Chip", "Cup");
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
