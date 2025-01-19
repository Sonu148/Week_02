package Access_Modifier.EmployeeRecords;

public class Employee {
    // Public: accessible from any class
    public int employeeID;

    // Protected: accessible within the same package and subclasses
    protected String department;

    // Private: only accessible within this class
    private double salary;

    // Constructor to initialize employee
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }
}
class Manager extends Employee {

    // Constructor to initialize Manager
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);  // Calling the parent class constructor
    }

    // Method to access employeeID and department (public and protected members)
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

