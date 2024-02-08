
import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {
    public static List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John", "john@email.com", "john123"));
        users.add(new User(2, "Mary", "mary@email.com", "maryabc"));
        return users;
    }
    
    public static List<DVD> getDVDs(){
        List<DVD> DVDs = new ArrayList<>();
        DVDs.add(new DVD(1, "Barbie", 2023, "Greta Gerwig", "Fantasy"));
        DVDs.add(new DVD(2, "Toy Story", 1995, "John Lasseter", "Animation"));
        DVDs.add(new DVD(3, "Star War", 2022, "John Doe", "Sci-Fi"));
        return DVDs;
    }
    
    public static List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(4, "Harry Potter", 1997, "J. K. Rowling", "Novel"));
        books.add(new Book(5, "The Little Prince", 2010, "Antoine de Saint-Exupéry", "Novel"));
        books.add(new Book(6, "X-Men", 1963, "Stan Lee", "Comic"));
        return books;
    }
    
    public static List<Magazine> getMagazines(){
        List<Magazine> magazines = new ArrayList<>();
        magazines.add(new Magazine(7, "The New York Times", 2024, "Joseph Kahn", "News"));
        magazines.add(new Magazine(8, "Forbes", 2024, "Randall Lane", "Finance"));
        magazines.add(new Magazine(9, "National Geographic", 2024, "John Doe", "Science"));
        return magazines;
    }
    
    public static void borrowItem(int itemId) {
    if (checkItemAvailability(itemId)) {
        BorrowRecord borrowRecord = new BorrowRecord(itemId);
        addBorrowRecord(borrowRecord);
    } else {
        System.out.println("Unavailable");
    }
}

    private List<Object> items;
    public LibraryDatabase(){
        items = new ArrayList<>();
    }

    public List<Object> getItems() {
        return items;
    }
    
    
    public static List<BorrowRecord> BorrowRecords = new ArrayList<>();
    public static void addBorrowRecord(BorrowRecord BorrowRecord) {
        BorrowRecords.add(BorrowRecord);
    }

    // Checks item availability
    public static boolean checkItemAvailability(int itemId) {
    for (BorrowRecord borrowRecord : BorrowRecords) {
        if (borrowRecord.getItemId() == itemId) {
            return false;
        }
    }
    return true;
    }
}