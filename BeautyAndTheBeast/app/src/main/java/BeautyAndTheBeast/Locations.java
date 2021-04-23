package BeautyAndTheBeast;

import java.util.ArrayList;

public class Locations {
    public static ArrayList<Location> locations = new ArrayList<Location>();
    public static Location forest;
    public static Location village;
    public static Location castle;
    public static Location westWing;
    public static Location library;

    public static void createLocations() {
        forest = new Location("forest");
        village = new Location("village");
        castle = new Location("castle");
        westWing = new Location("west wing");
        library = new Location("library");

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
