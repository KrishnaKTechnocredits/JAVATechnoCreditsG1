//Client Class Of Circle
package mayur;

import java.util.Scanner;

public class ClientCircle 
{

	public static void main(String[] args) 
	{
		Circle circle = new Circle();
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radious of circle");
		circle.radious = sc.nextFloat();*/   
		circle.areaCircle();// method calling to find area of circle
		circle.CircumferenceCircle();// method calling to find Circumference of Circle
	}
}
