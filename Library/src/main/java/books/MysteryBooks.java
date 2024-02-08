package books;
import java.util.ArrayList;
import java.util.Collections;

public class MysteryBooks {

    public static ArrayList<String> getMysteryBooks() {
        ArrayList<String> mysteryBooks = new ArrayList<>();

        // adds mystery books
        mysteryBooks.add("The Da Vinci Code - Dan Brown");
        mysteryBooks.add("Gone Girl - Gillian Flynn");
        mysteryBooks.add("The Girl with the Dragon Tattoo - Stieg Larsson");
        mysteryBooks.add("The No. 1 Ladies' Detective Agency - Alexander McCall Smith");
        mysteryBooks.add("The Big Sleep - Raymond Chandler");
        mysteryBooks.add("In the Woods - Tana French");
        mysteryBooks.add("The Curious Incident of the Dog in the Night-Time - Mark Haddon");
        mysteryBooks.add("Sharp Objects - Gillian Flynn");
        mysteryBooks.add("Big Little Lies - Liane Moriarty");
        mysteryBooks.add("The Cuckoo's Calling - Robert Galbraith (J.K. Rowling)");
        mysteryBooks.add("The Secret History - Donna Tartt");
        mysteryBooks.add("And Then There Were None - Agatha Christie");
        mysteryBooks.add("The Hound of the Baskervilles - Arthur Conan Doyle");
        mysteryBooks.add("The Silent Patient - Alex Michaelides");
        mysteryBooks.add("The Woman in Cabin 10 - Ruth Ware");
        mysteryBooks.add("The 7½ Deaths of Evelyn Hardcastle - Stuart Turton");
        mysteryBooks.add("The Secret Place - Tana French");
        mysteryBooks.add("The Talented Mr. Ripley - Patricia Highsmith");
        mysteryBooks.add("The Secret Keeper - Kate Morton");
        mysteryBooks.add("The Secret - Rhonda Byrne");
        mysteryBooks.add("The Dry - Jane Harper");
        mysteryBooks.add("The Snowman - Jo Nesbo");
        mysteryBooks.add("The Lost Man - Jane Harper");
        mysteryBooks.add("The Reversal - Michael Connelly");
        mysteryBooks.add("The Murder of Roger Ackroyd - Agatha Christie");

        Collections.sort(mysteryBooks);
        return mysteryBooks;
    }
}
