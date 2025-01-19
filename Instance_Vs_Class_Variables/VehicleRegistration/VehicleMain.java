package Instance_Vs_Class_Variables.VehicleRegistration;

public class VehicleMain {
    public static void main(String[] args) {
        // Creating some vehicles
        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle");

        // Displaying vehicle details
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Changing the registration fee
        Vehicle.updateRegistrationFee(250.0);

        // Displaying updated vehicle details
        System.out.println("Updated Vehicle Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
