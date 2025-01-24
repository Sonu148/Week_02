package day_05.assistedproblems.animalhierarchy;

public class Bird extends Animal {
    Bird (String name, int age){
        super(name, age);
    }
    void makeSound(){
        System.out.println("Birds Chirping!!");
    }
}
