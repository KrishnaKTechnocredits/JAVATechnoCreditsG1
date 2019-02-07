//Program to find largest of three using AND operator
package mayur;
import java.util.Scanner;
public class LargeOfThreeUsingAndOp {
	public LargeOfThreeUsingAndOp(int x, int y, int z) {
		if (x > y && x > z) //comparing x with y and z
			System.out.println(" Largest number is :" + x);
		else if (y > x && y > z)//comparing y with x and z
			System.out.println("Largest number is:" + y);
		else if (z > x && z > y)//comparing z with x and y
			System.out.println("Largest number is " + z);
		else
			System.out.println("All numbers are equal");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		@SuppressWarnings("unused")
		LargeOfThreeUsingAndOp largerst = new LargeOfThreeUsingAndOp(x, y, z);
		sc.close();
	}

}
