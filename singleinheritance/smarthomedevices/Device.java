package day_05.singleinheritance.smarthomedevices;

public class Device {
    // variables to store common attributes
    int deviceId;
    String status;

    // constructor for the common attributes
    public Device(int deviceId, String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    // method for the display the status of the device.
    void deviceStatus(){
        System.out.println("The device id is :"+deviceId);
        System.out.println("The device status is :"+status);
    }
}
