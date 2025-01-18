package Day_01.Level_2;

 class MovieTicket {

    // declare variable for Movie ticket class
    private String movieName;
    private int seatNumber;
    private int price;
    private boolean isBooked;

    // create constructor to initialize values
    public MovieTicket(String movieName, int price) {
        this.movieName = movieName;
        this.isBooked = false; // Initially ticket is not booked
        this.price = price;
    }

    // Method to book a ticket
    public boolean bookTicket(int seatNumber) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.isBooked = true;
            System.out.println("Seat is successfully booked!");
            return true;
        } else {
            System.out.println("Ticket is already booked.");
            return false;
        }
    }

    // Method to display ticket details
    public void displayMovieDetails() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat number: " + seatNumber);
            System.out.println("Price:  " + price);
        } else {
            System.out.println("No movie ticket is booked yet: " + movieName);
        }
    }
}

public class MovieTicketBooking {

    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket("Inception", 12);

        // Attempt to display details before booking
        ticket.displayMovieDetails();

        // Book the ticket
        ticket.bookTicket(25);

        // Display ticket details after booking
        ticket.displayMovieDetails();

        // Attempt to book the ticket again
        ticket.bookTicket(30);
    }
}
