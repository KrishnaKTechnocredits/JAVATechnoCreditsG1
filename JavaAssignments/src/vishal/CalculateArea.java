package vishal;

import java.util.Scanner;

public class CalculateArea {

	public double area(String Geometry) {
		Scanner sc = new Scanner(System.in);

		double area = 0.0;

		switch (Geometry) {
		case "rectangle":
			System.out.println("Enter length");
			int length = sc.nextInt();
			System.out.println("Enter breadth");
			int breadth = sc.nextInt();
			area = length * breadth;
			break;

		case "triangle":
			System.out.println("Enter base");
			double base = sc.nextDouble();
			System.out.println("Enter height");
			double height = sc.nextDouble();
			area = 0.5 * base * height;
			break;

		case "circle":
			System.out.println("Enter radius");
			double radius = sc.nextDouble();
			area = 3.14 * radius * radius;
			break;

		default:
			System.out.println("Invalid Input: Please enter Geometric Shape Like rectangle, triangle, circle");

		}
		return area;
	}

	public static void main(String[] args) {
		CalculateArea ca = new CalculateArea();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Geometric Shape Like rectangle, triangle, circle");
		String Shape = sc.next();
		double result = ca.area(Shape);
		System.out.println(Shape + " Area is " + result);

	}

}
