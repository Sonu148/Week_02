package Level_1.AreaOfCircle;

public class Circle {
    private double radius;
    private double area;

    //Default Constructor.
    Circle(){
        this(1.0);
    }

    // Parameterised Constructor.
    Circle(double radius){
       this.radius=radius;
    }

    // calculate the area of the circle.
    double calculateAreaOfCircle(){
         area= 3.14*radius*radius;
         return area;
    }
    void displayCircleArea(){
        calculateAreaOfCircle();
        System.out.println(area);
     }
}
