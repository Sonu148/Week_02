package Instance_Vs_Class_Variables.VehicleRegistration;

public class Vehicle {
    // Class variable shared among all instances
    static double registrationFee = 200.0;

    // Instance variables for vehicle details
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee updated to: $" + registrationFee);
    }
}
