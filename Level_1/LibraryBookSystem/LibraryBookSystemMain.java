package Level_1.LibraryBookSystem;

public class LibraryBookSystemMain {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99, true);
        System.out.println(book1);
        book1.borrow();

        Book book2 = new Book("1984", "George Orwell", 12.99, false);
        System.out.println(book2);
        book2.returnBook();
    }
}
