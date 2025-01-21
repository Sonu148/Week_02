package Day_03.Level_1;

public class Employee {
    static  String companyName= "Capgemini";
    final int id;
    String name;
    String designation;
    static int count=0;

    public Employee( int id, String name, String designation){
         this.id=id;
         this.name=name;
         this.designation=designation;
         count++;
    }

    void displayTheDetails(){
        if(this instanceof Employee) {
            System.out.println("The company name is: " + companyName);
            System.out.println("The id of the employee is: " + id);
            System.out.println("The name of the employee: " + name);
            System.out.println("The designation of the employee is: " + designation);
        }
    }
    static void getTotalEmployee(){
        System.out.println("The total employee is: "+count);
    }

    public static void main(String[]args){
        Employee emp1= new Employee(81, "Sohan", "Manager");
        Employee emp2=new Employee(83, "Mohan", "Assistant Manager" );

        emp1.displayTheDetails();
        emp2.displayTheDetails();
        Employee.getTotalEmployee();
    }
}
