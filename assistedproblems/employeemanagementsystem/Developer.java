package day_05.assistedproblems.employeemanagementsystem;
public class Developer extends Employee {
    // unique attribute for the developer
    String programmingLanguage;

    //constructor for common and unique attributes
    public Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id,  salary);
        this.programmingLanguage=programmingLanguage;

    }
    // override the method to add the more details.
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("The developer programming language is :"+programmingLanguage);
    }
}
