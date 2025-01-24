package day_05.assistedproblems.employeemanagementsystem;

public class Employee {
    // common attributes for all the employee
    String name;
    int id;
    double salary;

    //constructor for the initialise attributes
    public Employee(String name, int id, double salary){
        this.name=name;
        this.id= id;
        this.salary=salary;
    }
    //method for display the details.
    void displayDetails(){
        System.out.println("The name of the employee is : "+ name);
        System.out.println("The id of the employee is : "+ id);
        System.out.println("The salary of the employee is : "+ salary);
    }
}
