
public abstract class Item {
    protected int itemId;
    protected String title;
    protected int year;
    
    public int getItemId() {
        return itemId;
    }
    public String getTitle(int itemId) {
        return title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
