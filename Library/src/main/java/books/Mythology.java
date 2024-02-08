package books;
import java.util.ArrayList;
import java.util.Collections;

public class Mythology {

    public static ArrayList<String> getMythologyBooks() {
        ArrayList<String> mythologyBooks = new ArrayList<>();

        // Adds mythology books to array
        mythologyBooks.add("Norse Mythology by Neil Gaiman");
        mythologyBooks.add("The Power of Myth by Joseph Campbell");
        mythologyBooks.add("Mythology by Edith Hamilton");
        mythologyBooks.add("Bulfinch's Mythology by Thomas Bulfinch");
        mythologyBooks.add("The Iliad by Homer");
        mythologyBooks.add("The Odyssey by Homer");
        mythologyBooks.add("The Epic of Gilgamesh by Anonymous");
        mythologyBooks.add("Mythos by Stephen Fry");
        mythologyBooks.add("Metamorphoses by Ovid");
        mythologyBooks.add("The Hero with a Thousand Faces by Joseph Campbell");
        mythologyBooks.add("Mythology: Timeless Tales of Gods and Heroes by Edith Hamilton");
        mythologyBooks.add("D'Aulaires' Book of Greek Myths by Ingri and Edgar Parin d'Aulaire");
        mythologyBooks.add("The Prose Edda by Snorri Sturluson");
        mythologyBooks.add("The Norse Myths by Kevin Crossley-Holland");
        mythologyBooks.add("Theogony by Hesiod");
        mythologyBooks.add("Theogony and Works and Days by Hesiod");
        mythologyBooks.add("Theogony, Works and Days, and The Shield of Heracles by Hesiod");
        mythologyBooks.add("The Ramayana by R.K. Narayan");
        mythologyBooks.add("The Bhagavad Gita by Eknath Easwaran");
        mythologyBooks.add("The Mahabharata by William Buck");
        mythologyBooks.add("The Popol Vuh by Dennis Tedlock");
        mythologyBooks.add("Mythology: Greek Gods, Heroes, & Monsters by Lady Hestia Evans");
        mythologyBooks.add("Mythology: A Captivating Guide to Greek Mythology by Matt Clayton");
        mythologyBooks.add("Celtic Mythology: A Captivating Guide to Celtic Myths by Matt Clayton");
        mythologyBooks.add("Egyptian Mythology: A Fascinating Guide to the Gods, Goddesses, Monsters, and Mortals by Matt Clayton");

        Collections.sort(mythologyBooks);
        return mythologyBooks;
    }
}
