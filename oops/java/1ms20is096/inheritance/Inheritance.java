import java.util.*;
import java.lang.Math.*;
class Circle {
    float radius;
    Circle(float radius){
        this.radius=radius;
    }
    double circle_area(){
        return(Math.PI*radius*radius);
    }

}
class Sector extends Circle{
    double angle;
    Sector(float radius,double angle) {
        super(radius);
        this.angle=angle;
    }
    double sector_area(){
        return (0.5*radius*radius*angle);
    }
    
}
class Segment extends Circle{
    double length;
    Segment(float radius,double length) {
        super(radius);
        this.length=length;
    }
    double segment_area(){
        //Area_of_segment= r^2 *((r-h)/r) –(r-h) (2rh-h^2)^1/2
        return ((radius*radius)*((radius-length)/radius))-((radius-length)*Math.sqrt((2*radius*length)-(length*length)));
    }

    
    
}
public class Inheritance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Area of circle");
        System.out.println("2. Area of sector");
        System.out.println("3. Area of segment");
        System.out.println("4. Exit!");

        while(true){
            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            switch(ch){
                case 1:     
                        System.out.println("Enter the radius of the circle");
                        float r = sc.nextFloat();
                        Circle c = new Circle(r);
                        System.out.println("The area of the circle with radius "+r+ " is "+c.circle_area());
                        break;

                case 2:
                        System.out.println("Enter the radius of the circle");
                        r = sc.nextFloat();
                        System.out.println("Enter the sector angle in degrees");
                        double d = sc.nextDouble();
                        double p = (Math.PI/180)*d;
                        Sector s = new Sector(r,p);
                        System.out.println("The area of the sector with radius "+r+ " and sector angle "+ d+"(degrees) is "+s.sector_area());
                        break;
                
                case 3:
                        System.out.println("Enter the radius of the circle");
                        r = sc.nextFloat();
                        System.out.println("Enter the length of the segment");
                        double l = sc.nextDouble();
                        Segment se = new Segment(r,l);
                        System.out.println("The area of the segment with radius "+r+ " and segement length "+ l+" is "+se.segment_area());
                        break;
                
                case 4:
                        System.exit(0);
                        break;
                default:
                        System.out.println("Invalid choice");
            }
        }
    }
}
