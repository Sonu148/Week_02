package day_05.singleinheritance.libraryamanagement;

public class Main {
    public static void main(String[] args) {

        System.out.println("Book1:- ");
        // creating an author object 1 reference book class
        Book book1= new Author("Harry Potter", 2001, "JK rowling", "passionate");
        book1.displayInfo();

        System.out.println("Book2:- ");
        // creating an author object 2 reference book class
        Book book2= new Author("abc ", 1901, "xyz", "abcxyz");
        book2.displayInfo();
    }
}
