package day_05.assistedproblems.employeemanagementsystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Manager Details:");

        // Creating the instance of the manager
        Employee manager= new Manager("Satyam", 21, 29081, 12);
        //Display the details
        manager.displayDetails();

        System.out.println("Developer Details:");

        // Creating the instance of the manager
        Employee developer= new Developer("Mohan", 22, 7112, "Java");
        //Display the details
        developer.displayDetails();

        System.out.println("Intern Details:");

        // Creating the instance of the manager
        Employee intern= new Intern("Sohan", 23, 2133);
        //Display the details
        intern.displayDetails();
    }
}
