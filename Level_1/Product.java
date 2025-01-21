package Day_03.Level_1;

public class Product {
    // Static variable for discount
    static double discount = 10.0;

    // Final variable for product ID
    final String productID;
    String productName;
    long price;
    int quantity;

    // Static variable to count products
    static int count = 0;

    // Constructor to initialize product details
    public Product(String productID, String productName, long price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        count++;
    }

    // Static method to update the discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details
    void displayProductDetails() {
        if (this instanceof Product) { // Checks if the object is an instance of Product
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    // Static method to display total products count
    static void getTotalProducts() {
        System.out.println("Total products: " + count);
    }

    public static void main(String[] args) {
        // Create Product instances
        Product prod1 = new Product("1", "Laptop", 8000, 1);
        Product prod2 = new Product("2", "Phone", 6000, 2);

        // Display product details
        prod1.displayProductDetails();
        prod2.displayProductDetails();

        // Update and display discount
        Product.updateDiscount(15.0);
        System.out.println("Updated Discount: " + Product.discount + "%");

        // Display total products count
        Product.getTotalProducts();
    }
}
