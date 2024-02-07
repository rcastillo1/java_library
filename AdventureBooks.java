
import java.util.ArrayList;
import java.util.Collections;

public class AdventureBooks {

    public static ArrayList<String> getAdventureBooks() {
        ArrayList<String> adventureBooks = new ArrayList<>();

        // Adds adventure books
        adventureBooks.add("The Adventures of Huckleberry Finn by Mark Twain");
        adventureBooks.add("Treasure Island by Robert Louis Stevenson");
        adventureBooks.add("Jurassic Park by Michael Crichton");
        adventureBooks.add("The Call of the Wild by Jack London");
        adventureBooks.add("The Lost World by Arthur Conan Doyle");
        adventureBooks.add("Around the World in Eighty Days by Jules Verne");
        adventureBooks.add("Robinson Crusoe by Daniel Defoe");
        adventureBooks.add("The Swiss Family Robinson by Johann David Wyss");
        adventureBooks.add("Gulliver's Travels by Jonathan Swift");
        adventureBooks.add("White Fang by Jack London");
        adventureBooks.add("Journey to the Center of the Earth by Jules Verne");
        adventureBooks.add("King Solomon's Mines by H. Rider Haggard");
        adventureBooks.add("The Adventures of Sherlock Holmes by Arthur Conan Doyle");
        adventureBooks.add("The Time Machine by H.G. Wells");
        adventureBooks.add("The Odyssey by Homer");
        adventureBooks.add("The Iliad by Homer");
        adventureBooks.add("20,000 Leagues Under the Sea by Jules Verne");
        adventureBooks.add("The Jungle Book by Rudyard Kipling");
        adventureBooks.add("The Last of the Mohicans by James Fenimore Cooper");
        adventureBooks.add("The Three Musketeers by Alexandre Dumas");
        adventureBooks.add("Heart of Darkness by Joseph Conrad");
        adventureBooks.add("Robinson Crusoe by Daniel Defoe");
        adventureBooks.add("The Swiss Family Robinson by Johann David Wyss");
        adventureBooks.add("The Lost World by Arthur Conan Doyle");

        Collections.sort(adventureBooks);
        return adventureBooks;
    }
}
