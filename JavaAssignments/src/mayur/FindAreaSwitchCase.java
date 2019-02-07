// program to calculate area of Rectangle, area of Triangle and area of Circle using switch statement
package mayur;

import java.util.Scanner;

public class FindAreaSwitchCase 
{
	static Scanner sc = new Scanner(System.in);

	private void areaRectangle() 
	{
		System.out.println("Enter width and height of Rectangle");
		float w = sc.nextFloat();
		float h = sc.nextFloat();
		float areaRectangle = w * h;// formula to calculate area of Rectangle
		System.out.println("Area of Rectangle is " + areaRectangle);
		sc.close();
	}

	private void areaTriangle() 
	{
		System.out.println("Enter height and base of Triangle");
		float h = sc.nextFloat();
		float b = sc.nextFloat();
		float areaTriangle = (float) (0.5 * (h * b));// formula to calculate area of Triangle
		System.out.println("Area of Triangle is " + areaTriangle);
		sc.close();
	}

	private void areaCircle() 
	{
		System.out.println("Enter Radious of circle");
		float radious = sc.nextFloat();
		float areaCircle = (float) (3.14 * radious * radious);// formula to calculate area of circle
		System.out.println("Area of circle is " + areaCircle);
	}

	void operation(int choice) 
	{
		switch (choice) {
		case 1:
			areaRectangle();
			break;
		case 2:
			areaTriangle();
			break;
		case 3:
			areaCircle();
			break;
		default:
			System.out.println("You have selected invalid option");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println(" \n1-To find Area Of Rfiectangle \n2-To find Area Of Triangle \n3-To find Area Of Circle");
		System.out.println("Select option(1 OR 2 OR 3):");
		int choice = sc.nextInt();
		FindAreaSwitchCase findAreaSwitchCase = new FindAreaSwitchCase();
		findAreaSwitchCase.operation(choice);//method calling
		sc.close();
	}
}
