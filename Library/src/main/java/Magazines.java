
import java.util.ArrayList;
import java.util.Collections;

public class Magazines {

    public static ArrayList<String> getMagazines() {
        ArrayList<String> magazines = new ArrayList<>();

        // Add magazines to the ArrayList
        magazines.add("National Geographic");
        magazines.add("Time");
        magazines.add("The New Yorker");
        magazines.add("Vogue");
        magazines.add("People");
        magazines.add("Sports Illustrated");
        magazines.add("Reader's Digest");
        magazines.add("Cosmopolitan");
        magazines.add("Forbes");
        magazines.add("Rolling Stone");
        magazines.add("GQ");
        magazines.add("Entertainment Weekly");
        magazines.add("Harper's Bazaar");
        magazines.add("Scientific American");
        magazines.add("The Economist");
        magazines.add("Smithsonian");
        magazines.add("Better Homes and Gardens");
        magazines.add("Wired");
        magazines.add("O, The Oprah Magazine");
        magazines.add("Esquire");
        magazines.add("Newsweek");
        magazines.add("Bon Appétit");
        magazines.add("Architectural Digest");
        magazines.add("The Atlantic");
        magazines.add("Good Housekeeping");

        Collections.sort(magazines);
        return magazines;
    }
}
