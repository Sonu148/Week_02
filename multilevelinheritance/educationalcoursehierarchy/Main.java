package day_05.multilevelinheritance.educationalcoursehierarchy;

public class Main{
    public static void main(String[] args) {
        // creating the object of the paid online course with reference of the course class.
        Course course1= new PaidOnlineCourse("Java", "2 months","Coursera","yes",12000, 12);
        course1.displayInfo();
    }
}
