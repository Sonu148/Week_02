package day_05.assistedproblems.employeemanagementsystem;

public class Manager extends Employee {
    //Unique attributes if the manager
    int teamSize;
    //constructor for the common attributes and unique attributes
    public Manager(String name, int id, double salary, int teamSize){
        super(name, id ,salary);
        this.teamSize=teamSize;
    }
    //override the display details method to add new details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("The team size for manager : "+teamSize);
    }
}
