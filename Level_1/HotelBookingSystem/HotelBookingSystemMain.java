package Level_1.HotelBookingSystem;

public class HotelBookingSystemMain {
    public static void main(String[] args) {
        // Using the parameterized constructor
        HotelBooking booking1 = new HotelBooking("Alice", "Suite", 3);
        System.out.println(booking1);

        // Using the copy constructor
        HotelBooking booking2 = new HotelBooking(booking1);
        System.out.println(booking2);
    }
}