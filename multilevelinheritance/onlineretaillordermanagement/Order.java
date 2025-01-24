package day_05.multilevelinheritance.onlineretaillordermanagement;

public class Order {
    // Common attribute for all subclasses
    int orderId;
    String orderDate;

    // constructor to initialise the order object.
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    // method to display the details of order.
    void getOrderStatus(){
        System.out.println("The order id is: "+orderId);
        System.out.println("The order date is: "+orderDate);
     }
}
