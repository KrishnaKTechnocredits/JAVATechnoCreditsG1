package vishal;

import java.util.Scanner;

public class LargestOfThreeNumber {

	public void findLagest(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println("Largest No is " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Largest No is " + num2);
		} else {
			System.out.println("Largest No is " + num3);
		}
	}

	public static void main(String[] args) {
		LargestOfThreeNumber ln = new LargestOfThreeNumber();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num 1");
		int num1 = sc.nextInt();
		System.out.println("Enter num 2");
		int num2 = sc.nextInt();
		System.out.println("Enter num 3");
		int num3 = sc.nextInt();

		ln.findLagest(num1, num2, num3);

	}

}
