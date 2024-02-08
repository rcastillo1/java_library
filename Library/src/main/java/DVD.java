

public class DVD extends Item{
    private String director;
    private String genre;

    public String getDirector() {
        return director;
    }


    public String getGenre() {
        return genre;
    }

    
    public DVD(int itemId, String title, int year, String director, String genre) {
        this.itemId = itemId;
        this.title = title;
        this.year = year;
        this.director = director;
        this.genre = genre;
    }
//gets the items from dvd.java
public static void getItems(DVD[] dvds) {
    for (DVD dvd : dvds) {
        int itemId = dvd.getItemId();
        String title = dvd.getTitle();
        int year = dvd.getYear();
        String director = dvd.getDirector();
        String genre = dvd.getGenre();

        // Do something with the DVD item
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println();
        }
    }
}