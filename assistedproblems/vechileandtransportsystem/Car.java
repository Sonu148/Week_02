package day_05.assistedproblems.vechileandtransportsystem;

public class Car extends Vechile{
    int seatCapacity;// additional attributes

    // constructor with additional attributes
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;// initialise the seat capacity attribute
    }
   // method for the display the car details
    void displayInfo(){
        super.displayInfo();
        System.out.println("The seat capacity is :"+seatCapacity+" seats");
    }
}
