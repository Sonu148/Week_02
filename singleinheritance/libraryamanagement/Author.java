package day_05.singleinheritance.libraryamanagement;

public class Author extends Book {
    String name;// variable to store the name of the author
    String bio;// variable to store the bio.

    // creating constructor with common and additional attribute
    public Author (String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }
    //method for display the info of book with additional info.
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The name of the author is: "+name);
        System.out.println("The bio of the author is: "+bio);
    }
}
