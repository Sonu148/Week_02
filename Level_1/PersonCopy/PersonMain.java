package Level_1.PersonCopy;

public class PersonMain {
    public static void main(String[]args){

        Person p1= new Person();
        p1.displayPersonDeatils();

        Person p2= new Person(p1);
        p2.displayPersonDeatils();
    } 
}
