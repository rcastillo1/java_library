
import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {

    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        
        items.add(new Book(1, "The Great Gatsby", 1925, "F. Scott Fitzgerald", "Novel"));
        items.add(new DVD(2, "Inception", 2010, "Christopher Nolan", "Sci-Fi"));
        items.add(new Magazine(3, "National Geographic", 2022, "John Doe", "Science"));

        return items;
    }

    // Add a new item (not applicable in this case, as we are not connecting to a real database)
    public void addItem(Item item) {
        // Implementation not required for hardcoded data
    }
}
