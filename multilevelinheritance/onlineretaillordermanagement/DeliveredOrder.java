package day_05.multilevelinheritance.onlineretaillordermanagement;

public class DeliveredOrder extends ShippedOrder{
     String deliveryDate;// additional attribute for deliver date
    // constructor for all common and additional attribute
    public DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    // override the method from shipped order subclass and add more details
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("The delivery Date is: "+deliveryDate);
    }
}
