import java.util.Date;
import java.util.List;


public class UserDatabase {

    private static List<UserDatabase> users = new ArrayList<>();
    private static List<Item> items = new ArrayList<>();
    private static List<BorrowRecord> BorrowRecords = new ArrayList<>();

    // Adds user to array
    public static void addUser(UserDatabase user) {
        users.add(user);
    }

    // Retrieves all users from array
    public static List<UserDatabase> getUsers() {
        return users;
    }

    // Checks user credentials
    public static boolean checkUserCredentials(String email, String password) {
        for (UserDatabase user : users) {
            if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    // Adds items to array
    public static void addItem(Item item) {
        items.add(item);
    }

    // Retrieves items from the array
    public static List<Item> getItems() {
        return items;
    }

    // Adds borrow record
    public static void addBorrowRecord(BorrowRecord BorrowRecord) {
        BorrowRecords.add(BorrowRecord);
    }

    // Retrieved all borrow records
    public static List<BorrowRecord> getBorrowRecords() {
        return BorrowRecords;
    }

    // Checks item availability
    public static boolean checkItemAvailability(int itemId) {
        // Logic to check item availability
        return true;
    }

    // Updates return date in borrow record
    public static void updateReturnDate(int userId, int itemId, Date returnDate) {
        for (BorrowRecord borrowRecord : BorrowRecords) {
            if (borrowRecord.getUserId() == userId && borrowRecord.getItemId() == itemId && borrowRecord.getReturnDate() == null) {
                borrowRecord.setReturnDate(returnDate);
                break;
            }
        }
    }
}
