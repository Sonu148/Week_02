package Day_03.Level_1;

public class Student {
    // Static variable for university name
    static String universityName = "XYZ University";

    // Final variable for roll number
    final String rollNumber;
    String name;
    String grade;

    // Static variable to count students
    static int count = 0;

    // Constructor to initialize student details
    public Student(String rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        count++;
    }

    // Static method to display total students count
    static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + count);
    }

    // Method to display student details
    void displayStudentDetails() {
        if (this instanceof Student) { // Checks if the object is an instance of Student
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        }
    }

    public static void main(String[] args) {
        // Create Student instances
        Student student1 = new Student("S001", "John Doe", "A");
        Student student2 = new Student("S002", "Jane Smith", "B");

        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Display total students count
        Student.displayTotalStudents();
    }
}
