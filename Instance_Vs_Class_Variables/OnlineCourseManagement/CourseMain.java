package Instance_Vs_Class_Variables.OnlineCourseManagement;

public class CourseMain {
    public static void main(String[] args) {
        // Setting a default institute name
        Course.instituteName = "Tech Academy";

        // Creating some courses
        Course course1 = new Course("Java Programming", 12, 500.0);
        Course course2 = new Course("Web Development", 8, 400.0);
        Course course3 = new Course("Data Science", 16, 600.0);

        // Displaying course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
        System.out.println();

        System.out.println("Course 3 Details:");
        course3.displayCourseDetails();
        System.out.println();

        // Changing the institute name
        Course.updateInstituteName("Global Academy");

        // Displaying updated course details
        System.out.println("Updated Course Details:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
