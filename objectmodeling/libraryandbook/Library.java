package day_04.objectmodeling.libraryandbook;

import java.util.ArrayList;
import java.util.List;

public class Library {

     private String libraryName;
     private List<Book> books;

     public Library(String libraryName){
         this.libraryName=libraryName;
         this.books=new ArrayList<>();
     }

     // method to add a book to library.
    public void addBook(Book book){
         books.add(book);
    }

     public void displayLibraryBook(){
         System.out.println("The library name is : "+ libraryName);
         for(Book book : books){
             book.displayBookDetails();
         }
     }


}
