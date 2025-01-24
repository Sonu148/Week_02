package day_05.assistedproblems.vechileandtransportsystem;

public class Main {
    public static void main(String[] args) {

        System.out.println("Display the car details:-");
        Vechile car=new Car(23,"Petrol", 5);
        car.displayInfo();

        System.out.println("Display the car details:-");
        Vechile truck=new Truck(23,"Diesel");
        truck.displayInfo();

        System.out.println("Display the car details:-");
        Vechile motorcycle=new Motorcycle(23,"Petrol");
        motorcycle.displayInfo();

    }
}
