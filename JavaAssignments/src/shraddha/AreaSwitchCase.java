//----------------------------------------------------------------
//Assignment: Write a program to calculate area of Rectangle, area of Triangle and area of Circle using switch statement.
//Make it a menu driven program..
//----------------------------------------------------------------

package shraddha;

import java.util.Scanner;

public class AreaSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the option you want:" + "\n" + "1. Area of Rectangle" + "\n"
				+ "2. Area of Triangle" + "\n" + "3. Area of Circle");
		int option = sc.nextInt();
		float length = 0, breadth = 0, area_rec = 0;
		float base = 0, height = 0, area_tri = 0;
		double area_Circle = 0;
		float radius = 0;

		switch (option) {
		case 1:
			System.out.println("Please enter length and Breadth: ");
			length = sc.nextInt();
			breadth = sc.nextInt();
			area_rec = length * breadth;
			System.out.println("Area of Rectangle:= "+area_rec);
			break;

		case 2:
			System.out.println("Enter base and height: ");
			base = sc.nextInt();
			height = sc.nextInt();
			area_tri = 1 / 2 * base * height;
			System.out.println("Area of Triangle:= "+area_tri);
			break;

		case 3:
			System.out.println("Enter radius: ");
			radius = sc.nextInt();
			height = sc.nextInt();
			area_Circle = (3.14 * radius * radius);
			System.out.println("Area of Circle:= "+area_Circle);
			break;

		default:
			System.out.println("Sorry Wrong option :(");
			break;

		}
	}

}
