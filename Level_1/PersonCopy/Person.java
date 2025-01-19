package Level_1.PersonCopy;

public class Person {
     private String name;
     private int age;
     private double height;
     private String location;

     // deafult constructor.
     Person(){
        name="Sohan";
        age=19;
        height=5.7;
        location= "Bhopal";
     }

     // Copy constructor.
     Person(Person another){
          this.name=another.name;
          this.age=another.age;
          this.height=another.height;
          this.location=another.location;
     }
    
     // Mehtod for the display the person details.
     void displayPersonDeatils(){
        System.out.println("The name of the person is:"+name);
        System.out.println("The age of the person is: "+age);
        System.out.println("The height of the person is: "+height);
        System.out.println("The location of the person is: "+location);


     }
    
    
 }
