package Day_02.Level_1.Book;

public class BookMain {
    public static void main(String[]args){

        // Calling default constructor.
        Book book1= new Book();
        System.out.println("Book-1:");
        book1.displayBookDetails();

        // calling the parameterised constructor.
        Book book2= new Book("ABC", "XYZ", 199);
        System.out.println("Book-2:");
        book2.displayBookDetails();
    }
}
