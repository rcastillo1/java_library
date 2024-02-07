
import java.util.ArrayList;
import java.util.Collections;

public class HorrorBooks {

    public static ArrayList<String> getHorrorBooks() {
        ArrayList<String> horrorBooks = new ArrayList<>();

        // Adds horror books
        horrorBooks.add("The Haunting of Hill House - Shirley Jackson");
        horrorBooks.add("Psycho - Robert Bloch");
        horrorBooks.add("The Call of Cthulhu - H.P. Lovecraft");
        horrorBooks.add("Bird Box - Josh Malerman");
        horrorBooks.add("House of Leaves - Mark Z. Danielewski");
        horrorBooks.add("Let the Right One In - John Ajvide Lindqvist");
        horrorBooks.add("Ghost Story - Peter Straub");
        horrorBooks.add("Hell House - Richard Matheson");
        horrorBooks.add("The Fisherman - John Langan");
        horrorBooks.add("The Troop - Nick Cutter");
        horrorBooks.add("Mexican Gothic - Silvia Moreno-Garcia");
        horrorBooks.add("The Luminous Dead - Caitlin Starling");
        horrorBooks.add("The Southern Book Club's Guide to Slaying Vampires - Grady Hendrix");
        horrorBooks.add("My Best Friend's Exorcism - Grady Hendrix");
        horrorBooks.add("The Deep - Nick Cutter");
        horrorBooks.add("The Hunger - Alma Katsu");
        horrorBooks.add("The Only Good Indians - Stephen Graham Jones");
        horrorBooks.add("The Last Final Girl - Stephen Graham Jones");
        horrorBooks.add("The Ballad of Black Tom - Victor LaValle");
        horrorBooks.add("Head Full of Ghosts - Paul Tremblay");
        horrorBooks.add("Mapping the Interior - Stephen Graham Jones");
        horrorBooks.add("Mongrels - Stephen Graham Jones");
        horrorBooks.add("Kill Creek - Scott Thomas");
        horrorBooks.add("The Southern Reach Trilogy - Jeff VanderMeer");

        Collections.sort(horrorBooks);
        return horrorBooks;
    }
}
