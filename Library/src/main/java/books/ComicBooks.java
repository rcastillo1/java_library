package books;
import java.util.ArrayList;
import java.util.Collections;

public class ComicBooks {

    public static ArrayList<String> getComicBooks() {
        ArrayList<String> comicBooks = new ArrayList<>();

        // Adds comic books to array
        comicBooks.add("Watchmen by Alan Moore and Dave Gibbons");
        comicBooks.add("Sandman by Neil Gaiman");
        comicBooks.add("Saga by Brian K. Vaughan and Fiona Staples");
        comicBooks.add("Batman: The Dark Knight Returns by Frank Miller");
        comicBooks.add("Maus by Art Spiegelman");
        comicBooks.add("The Walking Dead by Robert Kirkman and Tony Moore");
        comicBooks.add("Y: The Last Man by Brian K. Vaughan and Pia Guerra");
        comicBooks.add("Preacher by Garth Ennis and Steve Dillon");
        comicBooks.add("The Umbrella Academy by Gerard Way and Gabriel Bá");
        comicBooks.add("Bone by Jeff Smith");
        comicBooks.add("Sin City by Frank Miller");
        comicBooks.add("Locke & Key by Joe Hill and Gabriel Rodríguez");
        comicBooks.add("Hellboy by Mike Mignola");
        comicBooks.add("The Sandman Universe by Neil Gaiman and various authors");
        comicBooks.add("Fables by Bill Willingham");
        comicBooks.add("V for Vendetta by Alan Moore and David Lloyd");
        comicBooks.add("Invincible by Robert Kirkman and Cory Walker");
        comicBooks.add("Saga of the Swamp Thing by Alan Moore");
        comicBooks.add("The Boys by Garth Ennis and Darick Robertson");
        comicBooks.add("Transmetropolitan by Warren Ellis and Darick Robertson");
        comicBooks.add("Persepolis by Marjane Satrapi");
        comicBooks.add("Bone by Jeff Smith");
        comicBooks.add("Locke & Key by Joe Hill and Gabriel Rodríguez");
        comicBooks.add("Kick-Ass by Mark Millar and John Romita Jr.");

        Collections.sort(comicBooks);
        return comicBooks;
    }
}
