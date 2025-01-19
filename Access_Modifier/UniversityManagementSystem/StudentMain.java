package Access_Modifier.UniversityManagementSystem;

public class StudentMain {
    public static void main(String[] args) {
        // Creating an instance of Student class
        Student student = new Student(101, "John Doe", 8.5);
        
        // Accessing and modifying CGPA using public methods
        System.out.println("CGPA: " + student.getCGPA());
        student.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student.getCGPA());
        
        // Creating an instance of PostgraduateStudent class
        PostgraduateStudent postgrad = new PostgraduateStudent(102, "Jane Smith", 9.2);
        
        // Accessing the protected 'name' member in subclass
        postgrad.displayName();
    }
}
