package Day_03.Level_1;

public class Patient {
    // Static variable for hospital name
    static String hospitalName = "\"Gov. Hospital\"";

    // Final variable for patient ID
    final String patientID;
    String name;
    int age;
    String ailment;

    // Static variable to count patients
    static int count = 0;

    // Constructor to initialize patient details
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        count++;
    }

    // Static method to get total patients count
    static void getTotalPatients() {
        System.out.println("Total patients admitted: " + count);
    }

    // Method to display patient details
    void displayPatientDetails() {
        if (this instanceof Patient) { // Checks if the object is an instance of Patient
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        }
    }

    public static void main(String[] args) {
        // Create Patient instances
        Patient patient1 = new Patient("111", "Aman", 35, "Fever");
        Patient patient2 = new Patient("112", "Raman", 28, "Common-Cold");

        // Display patient details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        // Display total patients count
        Patient.getTotalPatients();
    }
}
