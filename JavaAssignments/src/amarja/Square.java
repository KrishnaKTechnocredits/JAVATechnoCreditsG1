package amarja;
import java.util.Scanner;
/*Create a Square class with field side, one parameterized constructor which accept side value .
Write a method to find the area of a square. Write a TestSquareClass to verify Square class
functionality.
NOTE : square method should not take any parameter, constructor should set side value in
instance variable and square method should use that instance variable. */
public class Square {
	double side;
	Square(double side1)
	{
	Scanner sr=new Scanner(System.in);
	System.out.println("Enter side of square");
	side =sr.nextDouble();
	System.out.println(side);
	sr.close();
	}
	double area()
	{
		return side*side;
	}
}
