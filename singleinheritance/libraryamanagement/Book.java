package day_05.singleinheritance.libraryamanagement;

public class Book {
    String title;// variable to store the title of the  book
    int publicationYear;// variable to store the publication year

    // parameterised constructor to initialise the variables.
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    // Method fpr the display the book details
    void displayInfo(){
        System.out.println("The title of the book is: "+title);
        System.out.println("The publication year of the book is: "+publicationYear);
    }
}
