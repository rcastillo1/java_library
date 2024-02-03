import java.util.Date;
import java.util.Random;

public class BorrowRecord {
    private int recordId;
    private int userId;
    private int itemId;
    private Date borrowDate;
    private Date returnDate;
    
    public int getRecordId() {
        return recordId;
    }

    public int getUserId() {
        return userId;
    }

    public int getItemId() {
        return itemId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }


    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    public BorrowRecord(int userId, int itemId, Date borrowDate) {
        this.recordId = recordId;
        this.userId = userId;
        this.itemId = itemId;
        this.borrowDate = borrowDate;
}
    private int generateRecordId() {
        // Logic to generate a unique recordId, e.g., using a counter or a random number
        // For simplicity, you can use a random number for demonstration
        return Math.abs(new Random().nextInt());
    }
}