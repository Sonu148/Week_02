package Day_01.Level_1;
class AreaOfCircle {

    float radius;

    public AreaOfCircle(float radius){
        this.radius=radius;
    }
    public void areaOfCircle(){
        float area= 3.14f*radius*radius;
        System.out.println(area);
     }

}
public class FindTheAreaOfCircle {
  
    public static void main(String[] args){
    
        AreaOfCircle circle = new AreaOfCircle(2.4f);

        System.out.print("The area of the circle is: ");
        circle.areaOfCircle();

    }
}
