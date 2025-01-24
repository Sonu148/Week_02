package day_05.singleinheritance.smarthomedevices;

public class Main {
    public static void main(String[] args) {

        System.out.println("The device1 details:- ");
        //Creating the object of the thermostat with reference of the Device
        Device device1= new Thermostat(2412, "good", "On");
        // Display the status of the device.
        device1.deviceStatus();

        System.out.println("The device2 details:- ");
        //Creating the object of the thermostat with reference of the Device
        Device device2= new Thermostat(2122, "extreme good", "On");
        // Display the status of the device.
        device2.deviceStatus();
    }

}
