package day_05.multilevelinheritance.educationalcoursehierarchy;

public class OnlineCourse extends Course {
     String platform;// attribute for platform
     String isRecorded; // attribute for the is Recorded

    // Constructor to initialize the name and age attributes with additional attribute
    public OnlineCourse(String courseName, String duration, String platform, String isRecorded) {
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    // Method to display the course details with
    // additional platform and is recorded
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The platform  is: " + platform);
        System.out.println("Is course recorded : " + isRecorded);
    }
}
