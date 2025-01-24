package day_05.multilevelinheritance.onlineretaillordermanagement;

public class Main {
    public static void main(String[] args) {
        // creating the object of Delivered Order
        Order order1=new DeliveredOrder(6347, "13 feb", 916321961, "16 feb");
        order1.getOrderStatus();
    }
}
