package day_05.assistedproblems.animalhierarchy;

public class Cat extends Animal {
    Cat(String name , int age){
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat says Meow Meow!!");
    }
}
