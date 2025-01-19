package Instance_Vs_Class_Variables.ProductInventory;

public class ProductInventoryMain {
    public static void main(String[] args) {
        // Creating products
        ProductInventory product1 = new ProductInventory("Laptop", 999.99);
        ProductInventory product2 = new ProductInventory("Smartphone", 799.99);
        ProductInventory product3 = new ProductInventory("Headphones", 199.99);

        // Displaying details of each product
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();
        System.out.println();

        System.out.println("Product 2 Details:");
        product2.displayProductDetails();
        System.out.println();

        System.out.println("Product 3 Details:");
        product3.displayProductDetails();
        System.out.println();

        // Displaying total number of products created
        ProductInventory.displayTotalProducts();
    }
}
