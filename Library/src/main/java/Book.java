

public class Book extends Item {
    private String author;
    private String genre;
    

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public Book(int itemId, String title, int year, String author, String genre) {
        this.itemId = itemId;
        this.title = title;
        this.year = year;
        this.author = author;
        this.genre = genre;
    }
    
}
