package day_05.singleinheritance.smarthomedevices;

public class Thermostat extends Device {
    //Additional attributes for the thermostat
    String temperatureSetting;
    // creating a constructor for common attributes and additional attribute
    public Thermostat(int deviceId, String status, String temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting=temperatureSetting;
    }
    // override the method from device class and add a more details
    void deviceStatus(){
        super.deviceStatus();
        System.out.println("The temperature setting is :"+temperatureSetting);
    }
}
