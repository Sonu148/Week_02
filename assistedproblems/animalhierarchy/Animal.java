package day_05.assistedproblems.animalhierarchy;

public class Animal {
    // attribute to store the data
    String name;
    int age;

    // constructor  to initialise the object.
      Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    // method for the make sound.
    void makeSound(){
        System.out.println("Animals produce a sound.");
    }
    public void displayTheDetails(){
        System.out.println("The name is: "+name);
        System.out.println("The age is: "+age);
    }
}
