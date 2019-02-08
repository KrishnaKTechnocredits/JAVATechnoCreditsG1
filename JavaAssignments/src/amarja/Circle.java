package amarja;
import java.util.Scanner;
/*Create a Circle class with fields radius as float Initialize the radius through method .Also create
separate method to calculate Area and Circumference of a Circle. Create another class as
ClientCircle and call the respective methods*/
public class Circle {
	float radius;
	Circle() //Constructor to initialize the radius
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		radius=sr.nextFloat();
		sr.close();
	}
	double area(float radius)
	{
		double area=3.14*radius*radius;
		return area;
	}
	double circum(float radius)
	{
		double circum=2*3.14*radius;
				return circum;
	}
}
