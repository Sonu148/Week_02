package Day_01.Level_1;
 class BookDetails {
    private String title;
    private String author;
    private int price;

    // Creating the constructor 
    public BookDetails (String title, String author, int price){
        this.title= title;
        this.author= author;
        this.price=price;

    }

    // method for display the results.
    public void displayBookDetails(){
        System.out.println("The Book title is: "+ title);
        System.out.println("The author name is: "+ author);
        System.out.println("The price of the book is "+price);

    }
}

public class BookHandle{
  
    public static void main(String[]args){

        BookDetails book1= new BookDetails("\"Wings of fire\"", "\"APJ abdul kalam\"",199);
        BookDetails book2= new BookDetails("\"Zero to One\"" , "\"Peter Theil\"", 199);
        
        System.out.println("Book1 details: ");
        book1.displayBookDetails();
        System.out.println("Book2 details: ");
        book2.displayBookDetails();

    }

}


 