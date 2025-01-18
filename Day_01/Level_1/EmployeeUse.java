package Day_01.Level_1;
class Employee {
    String name;
    int id;
    double salary;

    // Creating the constructor 
    public Employee(String name, int id, double salary){
        this.name= name;
        this.id=id;
        this.salary=salary;
    }

    // method for display the results.
    public void displayDetails(){
        System.out.println("The employee name is: "+ name);
        System.out.println("The id of the employee is "+id);
        System.out.println("The salary of the employee is: "+ salary);
    }
}

public class EmployeeUse{
  
    public static void main(String[]args){

        Employee employee1= new Employee("Sohan",282, 20000);
        Employee employee2= new Employee("Mohan",283, 22000);
        
        System.out.println("Employee1 details: ");
        employee1.displayDetails();
        System.out.println("Employee2 details: ");
        employee2.displayDetails();

    }

}

