package Access_Modifier.EmployeeRecords;

public class EmployeeMain {
    public static void main(String[] args) {
        // Creating an Employee instance
        Employee employee = new Employee(101, "Engineering", 75000.0);
        
        // Modifying the salary using the public method
        System.out.println("Initial Salary: $" + employee.getSalary());
        employee.setSalary(80000.0);
        System.out.println("Updated Salary: $" + employee.getSalary());
        
        // Creating a Manager instance
        Manager manager = new Manager(102, "Management", 95000.0);
        
        // Displaying manager details using subclass method
        manager.displayManagerDetails();
    }
}

