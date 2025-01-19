package Instance_Vs_Class_Variables.ProductInventory;

public class ProductInventory {
    private String productName;
    private double price;

    // Class variable to track total products created
    static int totalProducts = 0;

    // Constructor to initialize product details
    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment totalProducts each time a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
