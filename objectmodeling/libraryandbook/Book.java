package day_04.objectmodeling.libraryandbook;

public class Book {
    private String title;
    private String author;

    //constructor
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }

   //getter method
   /* public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }*/
    public  void displayBookDetails(){
        System.out.println("The book title: "+title+ " and the author is: "+author);
    }
}
