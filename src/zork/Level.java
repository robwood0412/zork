package zork;

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 5/5/12
 * Time: 7:36 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Scanner;


public class Level {
    public int Plant;
    public int Leaf;
    public int Bulb;
    public int Glass;
    public int Bowl;
    public int Hammer;
    public int Action;

    public static void main(String[] Args) {
        String Sit1 = "You are trapped in a room. You see a Plant, A Light, a Fish Bowl and a Hammer. What do you do?";
        String Diolog1 = "You Have Grabbed the Hammer.";
        String Diolog2 = "You Have Smashed the Light.";
        String Diolog3 = "You have grabbed the glass from the smashed light";
        String Diolog4 = "You have cut the grass";
        String Diolog5 = "You have fed the grass to your child. How happy he must be.";
        String Fail = "You fail at life, give me proper input";
        String CheckBowl = "There is a fish in there. It Seems to be hungry.";
        String CheckPlant = "It's a plant with many leaves. Have fun looking at it.";
        String CheckLight = "Look at that beautiful Glow. Luckily there are 2 light bulbs. Maybe we could use one later....";
        String CheckHammer = "Hmm It's a Hammer..... Look at its majesty.. Its best use is to crush things.";
        String CheckRoom = "You are trapped in a room. You see a Plant, A Light, a Fish Bowl and a Hammer. Wat do?";
        System.out.println(Sit1);
        Scanner input = new Scanner(System.in);
        String Action;
        Action = input.next();

        while (Action != "Kill Yourself") {
            Action = input.next(); // I need it to always scan for input and verify it with the next if Statment. How would i go about doing that?

            if (Action == "u") {
                System.out.println(CheckRoom);
            }
            else {
                System.out.println(Fail);
            }
        }
    }
}
