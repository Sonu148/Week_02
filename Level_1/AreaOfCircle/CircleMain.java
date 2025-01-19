package Level_1.AreaOfCircle;

public class CircleMain {
    public static void main(String[ ]args){
    
        //calling the deafult constructor
        Circle deafultCircle= new Circle();
        System.out.println("The area  of the circle of default circle is: ");
        deafultCircle.displayCircleArea();

        // calling the parameterised constructor.
        Circle customCircle= new Circle(5.0);
        System.out.println("The area of the custom circle is:");
        customCircle.displayCircleArea();
    }
}
