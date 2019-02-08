package vishal;

import java.util.Scanner;

public class Area {

	public int area(int length) {
		int area = length * length;
		return area;
	}

	public int area(int width, int height) {
		int area = height * width;
		return area;
	}

	public double area(double r) {
		double area = 3.14 * r * r;
		return area;

	}

	public static void main(String[] args) {
		Area ar = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length to calculate square area");
		int lengthS = sc.nextInt();
		System.out.println("Area of square is " + ar.area(lengthS));

		System.out.println("\nEnter length to calculate rectangle area");
		int length = sc.nextInt();
		System.out.println("Enter width to calculate rectangle area");
		int width = sc.nextInt();
		System.out.println("Area of rectangle is " + ar.area(length, width));

		System.out.println("\nEnter radius to calculate circle area");
		double r = sc.nextDouble();
		System.out.println("Area of circle is " + ar.area(r));

	}

}
