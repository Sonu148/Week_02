package day_04.objectmodeling.libraryandbook;

public class LibraryBookManagement {
    public static void main(String[] args) {
        //  creating  the object oof the book class.
        Book book1 = new Book("\"abc\"", "\"xyz\"");
        Book book2 = new Book("\"ABC\"", "\"XYZ\"");

        //  creating  the object of the library class.
        Library library1 = new Library("TIT Main library");
        Library library2 = new Library("TIT Excellence library");

        library1.addBook(book1);
        library2.addBook(book2);

        library1.displayLibraryBook();
        library2.displayLibraryBook();
    }
}