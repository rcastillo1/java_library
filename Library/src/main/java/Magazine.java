

public class Magazine extends Item{
    private String editor;
    private String category;

    public String getEditor() {
        return editor;
    }

    public String getCategory() {
        return category;
    }


    public Magazine(int itemId, String title, int year, String editor, String category) {
        this.itemId = itemId;
        this.title = title;
        this.year = year;
        this.editor = editor;
        this.category = category;
    }
    
}
