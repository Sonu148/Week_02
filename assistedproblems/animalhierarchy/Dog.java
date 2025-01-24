package day_05.assistedproblems.animalhierarchy;

import java.sql.SQLOutput;

public class Dog extends Animal {
     String type;
      public Dog(String name, int age, String type) {
        super(name, age);
        this.type=type;
    }
    void makeSound(){
        System.out.println("Dog barks!!");
    }

    @Override
    public void displayTheDetails() {
        super.displayTheDetails();
        System.out.println("The type is: "+type);
    }
}
