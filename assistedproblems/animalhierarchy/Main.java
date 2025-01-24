package day_05.assistedproblems.animalhierarchy;

public class Main {
    public static void main(String[]args){
       Animal dog= new Dog("Dog", 6, "Labrador");
        dog.displayTheDetails();
        dog.makeSound();
       Animal cat= new Cat("Cat", 9);
        cat.displayTheDetails();
        cat.makeSound();
       Animal bird= new Bird("Bird",2);
        bird.displayTheDetails();
        bird.makeSound();
    }

}
