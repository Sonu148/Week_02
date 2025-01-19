package Access_Modifier.UniversityManagementSystem;

public class Student {
    // Public: accessible from any class
    public int rollNumber;

    // Protected: accessible within the same package and subclasses
    protected String name;

    // Private: only accessible within this class
    private double CGPA;

    // Constructor to initialize the student
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

 class PostgraduateStudent extends Student {
    
    // Constructor to initialize postgraduate student
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);  // Calling the parent class constructor
    }

    // Method to demonstrate access to protected member 'name'
    public void displayName() {
        System.out.println("Name: " + name);  // Protected member accessed in subclass
    }
}
