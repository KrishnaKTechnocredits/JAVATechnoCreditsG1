package saket;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Press 1 to calculate area of Rectangle, Press 2 to calculate area of Triangle and Press 3 to calculate area of Circle");

		int menu = sc.nextInt();

		switch(menu)
		{
    case 1:
    	System.out.println("Enter length and breath of rectangle");
    	int l = sc.nextInt();
    	int b = sc.nextInt();
    	int Area=l*b;
    	System.out.println("Area of rectangle is"+ Area);
		break;
	case 2:
		System.out.println("Enter base and height of triangle");
    	int bs = sc.nextInt();
    	int h = sc.nextInt();
    	float TArea=(1/2f)*bs*h;
    	System.out.println("Area of trangle is"+ TArea);
       break;
	case 3:
		System.out.println("Enter the radius of circle");
    	int r = sc.nextInt();
    	float CArea=3.14f*r*r;
    	System.out.println("Area of circle is"+ CArea);
		break;
	default:
		System.out.println("Kindly Enter valid input");
	
}
	}}
