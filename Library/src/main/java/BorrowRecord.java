public class BorrowRecord {
    private int recordId;
    private int userId;
    private int itemId;
    
    public int getRecordId() {
        return recordId;
    }

    public int getUserId() {
        return userId;
    }

    public int getItemId() {
        return itemId;
    }

    public BorrowRecord(int itemId) {
        this.recordId = recordId;
        this.userId = userId;
        this.itemId = itemId;

    }  
    
}