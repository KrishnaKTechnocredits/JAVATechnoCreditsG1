//Client Class Of Circle
package mayur;

import java.util.Scanner;

public class ClientCircle {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radios of circle");
		float radious = sc.nextFloat();
		Circle circle = new Circle(radious);
		circle.areaCircle();// method calling to find area of circle
		circle.CircumferenceCircle();// method calling to find Circumference of Circle
	}
}
