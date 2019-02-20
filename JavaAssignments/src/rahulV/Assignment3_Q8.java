package rahulV;

import java.util.Scanner;

public class Assignment3_Q8 {

	float radius;

	void area(float radius) {
		System.out.println("Area of the circle is " + (3.14f * radius * radius));
	}

	void circumference(float radius) {
		System.out.println("Circumference of the circle is " + (2 * 3.14f * radius));
	}

	public static void main(String[] args) {

		Assignment3_Q8 circle = new Assignment3_Q8();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		float radius = sc.nextFloat();

		if (radius > 0) {
			circle.area(radius);
			circle.circumference(radius);
		}

		else {
			System.out.println("Invalid input!");
		}
	}

}
