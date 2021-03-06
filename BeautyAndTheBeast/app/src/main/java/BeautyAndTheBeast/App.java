/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BeautyAndTheBeast;

import java.util.Scanner;
import java.util.HashMap;

public class App {
    private static String[] prompts = { "A TALE AS OLD AS TIME",
            "1. An old lady comes to the castle asking for shelter. Does the prince refuse to let her in? y / n",
            "2. Belle's dad Marice leaves for the fair and doesn't return. Should Belle go searching for him? y / n",
            "3. Belle decides to explore the castle. Should she turn left or right? y / n",
            "4. The only place left to explore is the Forbidden West Wing. Does Belle enter? y /n",
            "5. Belle encounters a pack of wolves in the woods. Does the Beast rescue her? y / n",
            "6. Should Belle take care of the Beast? y / n",
            "7. The Beast cleans up the castle. He and Belle share a romantic dinner. They enjoy a song and dance number and fall deeper in love. Should Belle look in the enchanged mirror? y /n",
            "8. Belle rescues her father, but Gaston leads the villiagers to attack the Beast while she's gone. Gaston fatally stabs the Beast before falling to his death. Belle returns just in time to see the Beast. Does she tell him she loves him? y / n" };

    private static String[][] responses = { { "", "" },
            { "The old lady turns the prince into a Beast! He must learn to love in order to lift the curse.",
                    "Congrats! The prince dodges a bullet and lives happily ever after." },
            { "Belle finds Maurice at the castle and agrees to take his place as prisoner",
                    "Without her father around, Belle must marry Gaston. The End." },
            { "Belle enters the kitchen and meets the enchanted servants", "Belle finds the library!" },
            { "Belle discovers the rose and Beast yells at her. She flees to the forest.",
                    "Belle continues wandering the castle forever until everyone is dead. The End." },
            { "The Beast rescues Belle but gets hurt in the process.", "Belle dies in the woods." },
            { "Belle and the Beast start to fall in love.",
                    "Belle continues wandering the castle forever until everyone is dead." },
            { "Belle sees her father is in danger. The Beast lets her leave to rescue him",
                    "Belle and the Beast live happily ever after, oblivious to her father's peril." },
            { "The curse is broken! The Beast turns back into a man, happiness points for everyone.",
                    "The Beast dies. The End." } };

    private static boolean[] storyEnders = { false, true, true, false, true, true, true, true, true };

    private static HashMap<Integer, Runnable> yesFunctions = new HashMap<Integer, Runnable>();
    private static HashMap<Integer, Runnable> noFunctions = new HashMap<Integer, Runnable>();

    private static Rose rose;

    public static void setYesFunc() {

        yesFunctions.put(1, new Runnable() {
            public void run() {
                Cast.beast.castCurse();
                rose = new Rose("rose", "ability to lift curse", Locations.westWing);
            }
        });
        yesFunctions.put(2, new Runnable() {
            public void run() {
                Cast.belle.decreaseHappiness();
            }
        });

        yesFunctions.put(3, new Runnable() {
            public void run() {
                Cast.belle.increaseHappiness();
                rose.decreasePetals();
            }
        });

        yesFunctions.put(4, new Runnable() {
            public void run() {
                Cast.belle.decreaseHappiness();
                Cast.beast.decreaseHappiness();
                rose.decreasePetals();
            }
        });

        yesFunctions.put(5, new Runnable() {
            public void run() {
                Cast.belle.increaseHappiness();
                Cast.beast.increaseHappiness();
            }
        });

        yesFunctions.put(6, new Runnable() {
            public void run() {
                Cast.belle.increaseHappiness();
                Cast.beast.increaseHappiness();
                Cast.beast.fallInLove();
            }
        });

        yesFunctions.put(7, new Runnable() {
            public void run() {
                Cast.beast.decreaseHappiness();
            }
        });

        yesFunctions.put(8, new Runnable() {
            public void run() {
                Cast.beast.increaseHappiness();
                Cast.belle.increaseHappiness();
                Cast.beast.liftCurse();
            }
        });
    }

    public static void setNoFunc() {
        noFunctions.put(2, new Runnable() {
            public void run() {
                Cast.belle.decreaseHappiness();
            }
        });
        noFunctions.put(3, new Runnable() {
            public void run() {
                Cast.belle.increaseHappiness();
                rose.decreasePetals();
            }
        });

        noFunctions.put(4, new Runnable() {
            public void run() {
                Cast.belle.decreaseHappiness();
                rose.decreasePetals();
            }
        });

        noFunctions.put(5, new Runnable() {
            public void run() {
                Cast.belle.decreaseHappiness();
                Cast.beast.decreaseHappiness();
                rose.decreasePetals();
            }
        });

        noFunctions.put(6, new Runnable() {
            public void run() {
                Cast.belle.decreaseHappiness();
                Cast.beast.decreaseHappiness();
                rose.decreasePetals();
            }
        });

        noFunctions.put(7, new Runnable() {
            public void run() {
                Cast.beast.increaseHappiness();
                Cast.belle.fallInLove();
                Cast.beast.liftCurse();
            }
        });

        noFunctions.put(8, new Runnable() {
            public void run() {
                Cast.belle.decreaseHappiness();
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("Cast:");
        Cast.createCast();
        Cast.printCast();
        System.out.println("Locations:");
        Locations.createLocations();
        Locations.printLocations();

        // set up yes and no funcs
        setYesFunc();
        setNoFunc();

        int chapter = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println(prompts[0]);

        while (chapter < prompts.length) {
            System.out.println(prompts[chapter]);
            char answer = scanner.next().charAt(0);
            if (answer == 'y') {
                System.out.println(responses[chapter][0]);
                yesFunctions.get(chapter).run();
            } else {
                System.out.println(responses[chapter][1]);
                if (storyEnders[chapter]) {
                    System.out.println("The End");
                    return;
                }
            }
            chapter++;
        }
        scanner.close();

    }
}
