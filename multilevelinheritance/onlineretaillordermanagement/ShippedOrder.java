package day_05.multilevelinheritance.onlineretaillordermanagement;

public class ShippedOrder extends Order{
     int trackingNumber;// additional variable to store the tracking number.

    // constructor for all common and additional attribute
    public ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }
    // override the method and add more details
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("The tracking number is: "+trackingNumber);
    }
}
