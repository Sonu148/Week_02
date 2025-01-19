package Level_1.LibraryBookSystem;

class Book {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Constructor
    public Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow a book
    public void borrow() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed '" + title + "' by " + author + ".");
        } else {
            System.out.println("Sorry, '" + title + "' is currently unavailable.");
        }
    }

    // Method to return a book
    public void returnBook() {
        availability = true;
        System.out.println("'" + title + "' has been returned.");
    }

    @Override
    public String toString() {
        String status = availability ? "Available" : "Not Available";
        return "Title: " + title + ", Author: " + author + ", Price: $" + price + ", Status: " + status;
    }
}

