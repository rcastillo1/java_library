
import java.util.ArrayList;
import java.util.Collections;

public class Novels {

    public static ArrayList<String> getNovels() {
        ArrayList<String> novels = new ArrayList<>();

        // Adds novels
        novels.add("To Kill a Mockingbird - Harper Lee");
        novels.add("1984 - George Orwell");
        novels.add("Pride and Prejudice - Jane Austen");
        novels.add("The Catcher in the Rye - J.D. Salinger");
        novels.add("Brave New World - Aldous Huxley");
        novels.add("The Great Gatsby - F. Scott Fitzgerald");
        novels.add("One Hundred Years of Solitude - Gabriel García Márquez");
        novels.add("The Bell Jar - Sylvia Plath");
        novels.add("Beloved - Toni Morrison");
        novels.add("The Lord of the Rings - J.R.R. Tolkien");
        novels.add("Catch-22 - Joseph Heller");
        novels.add("The Brothers Karamazov - Fyodor Dostoevsky");
        novels.add("Moby-Dick - Herman Melville");
        novels.add("Don Quixote - Miguel de Cervantes");
        novels.add("War and Peace - Leo Tolstoy");
        novels.add("Anna Karenina - Leo Tolstoy");
        novels.add("Crime and Punishment - Fyodor Dostoevsky");
        novels.add("The Picture of Dorian Gray - Oscar Wilde");
        novels.add("Wuthering Heights - Emily Brontë");
        novels.add("Jane Eyre - Charlotte Brontë");
        novels.add("The Hobbit - J.R.R. Tolkien");
        novels.add("Frankenstein - Mary Shelley");
        novels.add("The Count of Monte Cristo - Alexandre Dumas");
        novels.add("Middlemarch - George Eliot");

        Collections.sort(novels);
        return novels;
    }
}
