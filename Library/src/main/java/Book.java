import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    // get the books from books.java
    public static List<Book> loadBooksFromFile(String filePath) {
        List<Book> books = new ArrayList<>();

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] bookData = line.split(",");

                int itemId = Integer.parseInt(bookData[0]);
                String title = bookData[1];
                int year = Integer.parseInt(bookData[2]);
                String author = bookData[3];
                String genre = bookData[4];

                Book book = new Book(itemId, title, year, author, genre);
                books.add(book);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }

        return books;
    }
}
