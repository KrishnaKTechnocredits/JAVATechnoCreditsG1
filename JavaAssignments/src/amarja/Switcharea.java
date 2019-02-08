package amarja;
import java.util.Scanner;
//Q7 WAP to find area of circle rectangle using Switch statement menu driven
public class Switcharea {
		void areacalci (char menu, Scanner sr)
		{
		double length; double breadth;double area;
		double radius;double base;double height;
		switch(menu)
		{
	            case '0':
	            	System.out.println("0:Rectangle Area Calculation:");
	            	System.out.println("Enter length of rectangle");
	            	length=sr.nextDouble();
	            	System.out.println("Enter breadth of rectangle");
	            	breadth=sr.nextDouble();
	            	System.out.println("Enter units");
	            	String unit =sr.next();
	                area = length * breadth;
	                System.out.println("Area of Rectangle with " + length + unit +" length and " + breadth +unit+" breadth " + "= "+ area +" sq"+unit);
	                break;
	           case '1':
	        	   	System.out.println("1:Triangle Area Calculation:");
	            	System.out.println("Enter base of triangle");
	            	base=sr.nextDouble();
	            	System.out.println("Enter height of triangle");
	            	height=sr.nextDouble();
	            	System.out.println("Enter units");
	            	unit =sr.next();
	                area = 0.5*base*height;
	                System.out.println("Area of Triangle with "+ base + unit+" base "+ height +unit+" height "+ "= "+ area+" sq"+unit);
	                break;
	            case '2':
	            	System.out.println("2:Circle Area Calculation:");
	            	System.out.println("Enter radius of circle");
	            	radius=sr.nextDouble();
	              	System.out.println("Enter units");
	              	unit =sr.next();
	                area = 3.14*radius*radius;
	                System.out.println("Area of Circle with "+ radius +unit+ " radius "+ "= "+ area +"sq"+unit);
	                break;
	                // Menu doesn't match any of the specified operators (0, 1, 2)*/
	            default:
	                System.out.printf("Error! Please select correct menu item");
	                return;
	}
	}		
		public static void main (String ar[])
		{	 
		Scanner sr =new Scanner (System.in);
		System.out.println("Enter menu item to perform the area function :");
		System.out.println("0: Area of Rectangle :");
		System.out.println("1: Area of Triangle :");
		System.out.println("2: Area of Circle :");
		char menu=sr.next().charAt(0);
		Switcharea cal= new Switcharea();
		cal.areacalci(menu,sr);
		sr.close();
	}
}
	        
		


