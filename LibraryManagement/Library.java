// Library.java
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("✅ Book added: " + book.getTitle());
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("❌ No books in library.");
            return;
        }
        System.out.println("\n📚 Library Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.getId() == id && !b.isIssued()) {
                b.issueBook();
                System.out.println("📖 Book issued: " + b.getTitle());
                return;
            }
        }
        System.out.println("❌ Book not available or already issued.");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id && b.isIssued()) {
                b.returnBook();
                System.out.println("✅ Book returned: " + b.getTitle());
                return;
            }
        }
        System.out.println("❌ Invalid return operation.");
    }
}
