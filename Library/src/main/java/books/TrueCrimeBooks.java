package books;
import java.util.ArrayList;
import java.util.Collections;

public class TrueCrimeBooks {

    public static ArrayList<String> getTrueCrimeBooks() {
        ArrayList<String> trueCrimeBooks = new ArrayList<>();

        // Adds true crime books
        trueCrimeBooks.add("In Cold Blood by Truman Capote");
        trueCrimeBooks.add("The Devil in the White City by Erik Larson");
        trueCrimeBooks.add("I'll Be Gone in the Dark by Michelle McNamara");
        trueCrimeBooks.add("Helter Skelter by Vincent Bugliosi");
        trueCrimeBooks.add("The Stranger Beside Me by Ann Rule");
        trueCrimeBooks.add("Midnight in the Garden of Good and Evil by John Berendt");
        trueCrimeBooks.add("People Who Eat Darkness by Richard Lloyd Parry");
        trueCrimeBooks.add("The Feather Thief by Kirk Wallace Johnson");
        trueCrimeBooks.add("The Executioner's Song by Norman Mailer");
        trueCrimeBooks.add("The Fact of a Body by Alexandria Marzano-Lesnevich");
        trueCrimeBooks.add("The Serial Killer Whisperer by Pete Earley");
        trueCrimeBooks.add("American Kingpin by Nick Bilton");
        trueCrimeBooks.add("The Run of His Life: The People v. O.J. Simpson by Jeffrey Toobin");
        trueCrimeBooks.add("The Road to Jonestown: Jim Jones and Peoples Temple by Jeff Guinn");
        trueCrimeBooks.add("Lost Girls: An Unsolved American Mystery by Robert Kolker");
        trueCrimeBooks.add("Mindhunter by John E. Douglas and Mark Olshaker");
        trueCrimeBooks.add("Chase Darkness with Me by Billy Jensen");
        trueCrimeBooks.add("The Poisoner's Handbook by Deborah Blum");
        trueCrimeBooks.add("A Wilderness of Error by Errol Morris");
        trueCrimeBooks.add("Columbine by Dave Cullen");
        trueCrimeBooks.add("Green River, Running Red by Ann Rule");
        trueCrimeBooks.add("The Monster of Florence by Douglas Preston and Mario Spezi");
        trueCrimeBooks.add("Fatal Vision by Joe McGinniss");
        trueCrimeBooks.add("The Grim Sleeper by Christine Pelisek");
        trueCrimeBooks.add("The Good Nurse by Charles Graeber");

        Collections.sort(trueCrimeBooks);
        return trueCrimeBooks;
    }
}
