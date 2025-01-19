package Level_1.CarRental;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private final double dailyRate = 50.0; // Example daily rate for car rental

    // Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost
    public double totalCost() {
        return rentalDays * dailyRate;
    }

    @Override
    public String toString() {
        return "Customer: " + customerName + ", Car Model: " + carModel + ", Rental Days: " + rentalDays
                + ", Total Cost: $" + totalCost();
    }
}