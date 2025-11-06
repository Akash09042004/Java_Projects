public class book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    // Issue the book
    public void issue() {
        isIssued = true;
    }

    // Return the book
    public void returnBook() {
        isIssued = false;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: \"" + title + "\", Author: " + author +
               ", Status: " + (isIssued ? "Issued ❌" : "Available ✅");
    }
}
