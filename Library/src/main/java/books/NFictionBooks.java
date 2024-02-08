package books;
import java.util.ArrayList;
import java.util.Collections;

public class NFictionBooks {

    public static ArrayList<String> getNFictionBooks() {
        ArrayList<String> nonfictionBooks = new ArrayList<>();

        // Add nonfiction books to the ArrayList
        nonfictionBooks.add("The Immortal Life of Henrietta Lacks by Rebecca Skloot");
        nonfictionBooks.add("The Warmth of Other Suns by Isabel Wilkerson");
        nonfictionBooks.add("Sapiens: A Brief History of Humankind by Yuval Noah Harari");
        nonfictionBooks.add("In Cold Blood by Truman Capote");
        nonfictionBooks.add("The Power of Habit by Charles Duhigg");
        nonfictionBooks.add("The Sixth Extinction: An Unnatural History by Elizabeth Kolbert");
        nonfictionBooks.add("Educated by Tara Westover");
        nonfictionBooks.add("Just Mercy: A Story of Justice and Redemption by Bryan Stevenson");
        nonfictionBooks.add("The Boys in the Boat: Nine Americans and Their Epic Quest for Gold at the 1936 Berlin Olympics by Daniel James Brown");
        nonfictionBooks.add("Quiet: The Power of Introverts in a World That Can't Stop Talking by Susan Cain");
        nonfictionBooks.add("The Devil in the White City: Murder, Magic, and Madness at the Fair That Changed America by Erik Larson");
        nonfictionBooks.add("Into Thin Air: A Personal Account of the Mount Everest Disaster by Jon Krakauer");
        nonfictionBooks.add("Hillbilly Elegy: A Memoir of a Family and Culture in Crisis by J.D. Vance");
        nonfictionBooks.add("Becoming by Michelle Obama");
        nonfictionBooks.add("The Year of Magical Thinking by Joan Didion");
        nonfictionBooks.add("The Wright Brothers by David McCullough");
        nonfictionBooks.add("Bad Blood: Secrets and Lies in a Silicon Valley Startup by John Carreyrou");
        nonfictionBooks.add("The Code Book: The Science of Secrecy from Ancient Egypt to Quantum Cryptography by Simon Singh");
        nonfictionBooks.add("The Gene: An Intimate History by Siddhartha Mukherjee");
        nonfictionBooks.add("The Emperor of All Maladies: A Biography of Cancer by Siddhartha Mukherjee");
        nonfictionBooks.add("The Glass Castle by Jeannette Walls");
        nonfictionBooks.add("Guns, Germs, and Steel: The Fates of Human Societies by Jared Diamond");
        nonfictionBooks.add("Thinking, Fast and Slow by Daniel Kahneman");
        nonfictionBooks.add("The Anatomy of a Miracle: The End of Apartheid and the Birth of the New South Africa by Patti Waldmeir");

        Collections.sort(nonfictionBooks);
        return nonfictionBooks;
    }
}
