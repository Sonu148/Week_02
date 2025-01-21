package Day_03.Level_1;
import java.util.*;

public class Book {

        static String libraryName = "Central Public Library";  // Static variable
        final long isbn;  // Final variable (Unique identifier for the book)
        String title;
        String author;

        static int count = 0;  // Static variable to keep track of the number of books

        // Parameterized Constructor
        Book(String title, String author, long isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            count++;  // Increment count whenever a new book is created
        }

        // Static method to display the library name
        static void displayLibraryName() {
            System.out.println("Library Name: " + libraryName);
        }

        // Instance method to display book details
        void displayBookDetails() {
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }

        // Static method to display the total number of books
        static void displayTotalBooks() {
            System.out.println("Total number of books in the library: " + count);
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Display library name
            Book.displayLibraryName();

            // Create first book
            System.out.println("\nEnter details for the first book:");
            System.out.print("Enter book title: ");
            String title1 = input.nextLine();
            System.out.print("Enter author name: ");
            String author1 = input.nextLine();
            System.out.print("Enter ISBN: ");
            long isbn1 = input.nextLong();
            input.nextLine();  // To clear the buffer

            Book book1 = new Book(title1, author1, isbn1);

            // Create second book
            System.out.println("\nEnter details for the second book:");
            System.out.print("Enter book title: ");
            String title2 = input.nextLine();
            System.out.print("Enter author name: ");
            String author2 = input.nextLine();
            System.out.print("Enter ISBN: ");
            long isbn2 = input.nextLong();

            Book book2 = new Book(title2, author2, isbn2);

            // Display details if the objects are instances of Book class
            if (book1 instanceof Book) {
                book1.displayBookDetails();
            }

            if (book2 instanceof Book) {
                book2.displayBookDetails();
            }

            // Display total books
            Book.displayTotalBooks();

            input.close();  // Close the scanner
        }
    }


