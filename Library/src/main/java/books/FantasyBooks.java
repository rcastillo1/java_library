package books;
import java.util.ArrayList;
import java.util.Collections;

public class FantasyBooks {

    public static ArrayList<String> getFantasyBooks() {
        ArrayList<String> fantasyBooks = new ArrayList<>();

        // Add Fantasy books to the ArrayList
        fantasyBooks.add("Harry Potter and the Sorcerer's Stone - J.K. Rowling");
        fantasyBooks.add("Harry Potter and the Chamber of Secrets - J.K. Rowling");
        fantasyBooks.add("Harry Potter and the Prisoner of Azkaban - J.K. Rowling");
        fantasyBooks.add("Harry Potter and the Goblet of Fire - J.K. Rowling");
        fantasyBooks.add("Harry Potter and the Order of the Phoenix - J.K. Rowling");
        fantasyBooks.add("Harry Potter and the Half-Blood Prince - J.K. Rowling");
        fantasyBooks.add("Harry Potter and the Deathly Hallows - J.K. Rowling");
        fantasyBooks.add("The Hobbit - J.R.R. Tolkien");
        fantasyBooks.add("The Lord of the Rings: The Fellowship of the Ring - J.R.R. Tolkien");
        fantasyBooks.add("The Lord of the Rings: The Two Towers - J.R.R. Tolkien");
        fantasyBooks.add("The Lord of the Rings: The Return of the King - J.R.R. Tolkien");
        fantasyBooks.add("A Game of Thrones - George R.R. Martin");
        fantasyBooks.add("Mistborn: The Final Empire - Brandon Sanderson");
        fantasyBooks.add("The Name of the Wind - Patrick Rothfuss");
        fantasyBooks.add("The Eye of the World - Robert Jordan");
        fantasyBooks.add("Eragon - Christopher Paolini");
        fantasyBooks.add("The Golden Compass - Philip Pullman");
        fantasyBooks.add("The Lies of Locke Lamora - Scott Lynch");
        fantasyBooks.add("The Way of Kings - Brandon Sanderson");
        fantasyBooks.add("The Priory of the Orange Tree - Samantha Shannon");
        fantasyBooks.add("Uprooted - Naomi Novik");
        fantasyBooks.add("Neverwhere - Neil Gaiman");
        fantasyBooks.add("The Final Empire - Mistborn: Book One - Brandon Sanderson");
        fantasyBooks.add("The Name of the Wind - Patrick Rothfuss");
        fantasyBooks.add("The Blade Itself - Joe Abercrombie");

        Collections.sort(fantasyBooks);
        return fantasyBooks;
    }
}
