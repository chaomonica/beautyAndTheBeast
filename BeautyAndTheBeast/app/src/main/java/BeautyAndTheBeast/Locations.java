package BeautyAndTheBeast;

import java.util.ArrayList;

public class Locations {
    public static ArrayList<Location> locations = new ArrayList<Location>();

    public static void createLocations() {
        Location forest = new Location("forest");
        Location village = new Location("village");
        Location castle = new Location("castle");
        Location westWing = new Location("west wing");
        Location library = new Location("library");

        locations.add(forest);
        locations.add(village);
        locations.add(castle);
        locations.add(westWing);
        locations.add(library);
    }

    public static void printLocations() {
        for (int i = 0; i < locations.size(); i++) {
            System.out.println(locations.get(i).name);
        }
    }

}
