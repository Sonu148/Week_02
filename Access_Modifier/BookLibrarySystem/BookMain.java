package Access_Modifier.BookLibrarySystem;

public class BookMain {
    public static void main(String[] args) {
        // Creating an instance of Book class
        Book book = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        
        // Accessing and modifying the author's name using public methods
        System.out.println("Author: " + book.getAuthor());
        book.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + book.getAuthor());
        
        // Creating an instance of EBook class
        EBook ebook = new EBook("978-0-13-468599-1", "Python Programming", "Alice");
        
        // Displaying the ISBN and title using subclass method
        ebook.displayBookDetails();
    }
}

