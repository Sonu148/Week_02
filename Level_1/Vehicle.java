package Day_03.Level_1;

public class Vehicle {
    // Static variable for registration fee
    static double registrationFee = 100.0;

    // Final variable for registration number
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    // Static variable to count vehicles
    static int count = 0;

    // Constructor to initialize vehicle details
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        count++;
    }

    // Static method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle details
    void displayVehicleDetails() {
        if (this instanceof Vehicle) { // Checks if the object is an instance of Vehicle
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    // Static method to display total vehicles count
    static void getTotalVehicles() {
        System.out.println("Total vehicles registered: " + count);
    }

    public static void main(String[] args) {
        // Create Vehicle instances
        Vehicle vehicle1 = new Vehicle("11", "Sohan", "Car");
        Vehicle vehicle2 = new Vehicle("12", "Mohan", "Motorbike");

        // Display vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Update and display registration fee
        Vehicle.updateRegistrationFee(120.0);
        System.out.println("Updated Registration Fee: " + Vehicle.registrationFee);

        // Display total vehicles count
        Vehicle.getTotalVehicles();
    }
}
