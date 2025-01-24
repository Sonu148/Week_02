package day_05.multilevelinheritance.educationalcoursehierarchy;


public class PaidOnlineCourse extends OnlineCourse{
    int fee;// attribute for fee
    int discount; // attribute for the is discount

    // Constructor to initialize the name and age attributes with
    // additional attribute fee and discount
    public PaidOnlineCourse(String courseName, String duration, String platform, String isRecorded, int fee, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee=fee;
        this.discount=discount;
    }
    // Method to display the course details with
    // additional fee and is discount
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount);
    }
}
