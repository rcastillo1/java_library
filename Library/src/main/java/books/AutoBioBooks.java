package books;

import java.util.ArrayList;
import java.util.Collections;

public class AutoBioBooks {

    public static ArrayList<String> getAutoBioBooks() {
        ArrayList<String> autobiographyBooks = new ArrayList<>();

        // Add autobiography books to array
        autobiographyBooks.add("The Diary of a Young Girl by Anne Frank");
        autobiographyBooks.add("Long Walk to Freedom by Nelson Mandela");
        autobiographyBooks.add("The Autobiography of Malcolm X by Malcolm X and Alex Haley");
        autobiographyBooks.add("Bossypants by Tina Fey");
        autobiographyBooks.add("Educated by Tara Westover");
        autobiographyBooks.add("Born a Crime by Trevor Noah");
        autobiographyBooks.add("Hillbilly Elegy by J.D. Vance");
        autobiographyBooks.add("The Glass Castle by Jeannette Walls");
        autobiographyBooks.add("I Know Why the Caged Bird Sings by Maya Angelou");
        autobiographyBooks.add("The Road to Wigan Pier by George Orwell");
        autobiographyBooks.add("The Color of Water by James McBride");
        autobiographyBooks.add("The Soul of a Butterfly by Muhammad Ali");
        autobiographyBooks.add("Angela's Ashes by Frank McCourt");
        autobiographyBooks.add("A Long Way Gone by Ishmael Beah");
        autobiographyBooks.add("Kitchen Confidential by Anthony Bourdain");
        autobiographyBooks.add("Night by Elie Wiesel");
        autobiographyBooks.add("The Immortal Life of Henrietta Lacks by Rebecca Skloot");
        autobiographyBooks.add("Narrative of the Life of Frederick Douglass by Frederick Douglass");
        autobiographyBooks.add("Open by Andre Agassi");
        autobiographyBooks.add("I Am Malala by Malala Yousafzai");
        autobiographyBooks.add("Born Standing Up by Steve Martin");
        autobiographyBooks.add("Wild by Cheryl Strayed");
        autobiographyBooks.add("Eat, Pray, Love by Elizabeth Gilbert");
        autobiographyBooks.add("Man's Search for Meaning by Viktor E. Frankl");

        Collections.sort(autobiographyBooks);
        return autobiographyBooks;
    }
}
