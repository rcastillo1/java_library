package books;
import java.util.ArrayList;
import java.util.Collections;

public class FairyTales {

    public static ArrayList<String> getFairytales() {
        ArrayList<String> fairytales = new ArrayList<>();

        // Add fairy tales to the ArrayList
        fairytales.add("Cinderella");
        fairytales.add("Snow White and the Seven Dwarfs");
        fairytales.add("Beauty and the Beast");
        fairytales.add("Sleeping Beauty");
        fairytales.add("The Little Mermaid");
        fairytales.add("Hansel and Gretel");
        fairytales.add("Little Red Riding Hood");
        fairytales.add("Rapunzel");
        fairytales.add("The Frog Prince");
        fairytales.add("The Princess and the Pea");
        fairytales.add("Rumpelstiltskin");
        fairytales.add("Jack and the Beanstalk");
        fairytales.add("The Ugly Duckling");
        fairytales.add("The Emperor's New Clothes");
        fairytales.add("The Pied Piper of Hamelin");
        fairytales.add("Thumbelina");
        fairytales.add("The Snow Queen");
        fairytales.add("The Three Little Pigs");
        fairytales.add("The Elves and the Shoemaker");
        fairytales.add("The Tortoise and the Hare");
        fairytales.add("The Gingerbread Man");
        fairytales.add("Puss in Boots");
        fairytales.add("The Little Match Girl");
        fairytales.add("Goldilocks and the Three Bears");

        Collections.sort(fairytales);
        return fairytales;
    }
}
