import java.util.ArrayList;
import java.util.List;

public class library {
    private List<book> books;

    public library() {
        books = new ArrayList<>();
    }

    // Add a new book
    public void addBook(book book) {
        books.add(book);
        System.out.println("✅ Book added successfully!");
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("📚 No books available in the library.");
            return;
        }
        System.out.println("\n📖 Books in Library:");
        for (book book : books) {
            System.out.println(book);
        }
    }

    // Issue a book by ID
    public void issueBook(int id) {
        for (book book : books) {
            if (book.getId() == id) {
                if (!book.isIssued()) {
                    book.issue();
                    System.out.println("✅ Book issued successfully!");
                } else {
                    System.out.println("❌ Book is already issued.");
                }
                return;
            }
        }
        System.out.println("❌ Book not found!");
    }

    // Return a book by ID
    public void returnBook(int id) {
        for (book book : books) {
            if (book.getId() == id) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("✅ Book returned successfully!");
                } else {
                    System.out.println("❌ Book was not issued.");
                }
                return;
            }
        }
        System.out.println("❌ Book not found!");
    }
}
