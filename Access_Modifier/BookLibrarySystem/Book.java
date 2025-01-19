package Access_Modifier.BookLibrarySystem;

public class Book {
    // Public: accessible from any class
    public String ISBN;

    // Protected: accessible within the same package and subclasses
    protected String title;

    // Private: only accessible within this class
    private String author;

    // Constructor to initialize Book
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }
}
 class EBook extends Book {

    // Constructor to initialize EBook
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);  // Calling the parent class constructor
    }

    // Method to demonstrate access to ISBN and title (public and protected members)
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}
