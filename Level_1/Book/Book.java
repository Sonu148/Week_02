package Day_02.Level_1.Book;

class Book{
    private String title;
    private String author;
    private double price;
    
    //Creating a default contructor.
      Book() {
        title= "Zero to One";
        author= "Peter Theil";
        price= 199;
    }

    // Parameterised constructor.
    public Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    // Method for the display the details.
    void displayBookDetails(){
      System.out.println("The book title is: "+title);
      System.out.println("The book author name: "+ author);
      System.out.println("The book price is: "+ price);
     }
}

