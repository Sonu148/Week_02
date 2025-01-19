package Instance_Vs_Class_Variables.OnlineCourseManagement;

public class Course {
    // Class variable shared across all instances
    static String instituteName = "Tech Academy";

    // Instance variables for course details
    private String courseName;
    private int duration;
    private double fee;

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute Name updated to: " + instituteName);
    }
}
