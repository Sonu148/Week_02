package day_05.assistedproblems.vechileandtransportsystem;

public class Vechile {
   // Attributes common for all subclasses
    int maxSpeed;
    String fuelType;
    // constructor for all the  common attributes
    public Vechile(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo(){
        System.out.println("The maximum speed is "+maxSpeed);
        System.out.println("The fuel type speed is "+fuelType);
    }
}
