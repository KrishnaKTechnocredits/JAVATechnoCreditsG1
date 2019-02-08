package amarja;
import java.util.Scanner;
//Create a class Area to find the area of Square, Rectangle and Circle by creating area()
public class Area {
	double area (float length)
	{
		float area=length*length;
		return area;
	}
	double area (double length,double breadth)
	{
		double area=length*breadth;
		return area;
	}
	double area (double radius)
	{
		double area = 3.14*radius*radius;
		return area;
	}	
	public static void main(String args[])
	{
		Scanner sr =new Scanner (System.in);
		System.out.println("Enter menu item to perform the area function :");
		System.out.println("0: Area of Rectangle :");
		System.out.println("1: Area of Square :");
		System.out.println("2: Area of Circle :");
		char menu=sr.next().charAt(0);
		Area cal= new Area();
		cal.display(menu,sr);
		sr.close();
	}
	private void display(char menu, Scanner sr) {
		switch (menu)
		{
		case '0':
			System.out.println("0:Rectangle Area Calculation:");
        	System.out.println("Enter length of rectangle");
        	double length=sr.nextDouble();
        	System.out.println("Enter breadth of rectangle");
        	double breadth=sr.nextDouble();
        	System.out.println("Enter units");
        	String unit =sr.next();
            System.out.println("Area of rectangle :" + area(length,breadth) + " sq"+unit);
            break;
		case '1':
			System.out.println("1:Square Area Calculation:");
        	System.out.println("Enter length of square");
        	float len=sr.nextFloat();
           	System.out.println("Enter units");
        	unit =sr.next();
            System.out.println("Area of square :" + area(len) + " sq"+unit);
            break;
		case '2':
        	System.out.println("2:Circle Area Calculation:");
        	System.out.println("Enter radius of circle");
        	double radius=sr.nextDouble();
          	System.out.println("Enter units");
          	unit =sr.next();
          	System.out.println("Area of square :" + area(radius) + " sq"+unit);
            break;
         default :
        	System.out.println("Error !! Menu item selected is incorrect");
           		}		
	}
}
