

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
}
