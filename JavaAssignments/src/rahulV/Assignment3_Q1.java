package rahulV;

import java.util.Scanner;

public class Assignment3_Q1 {

	void largestNum() { // method to display largest number

		int num1, num2, num3;
		System.out.println("Enter three integers ");
		Scanner sc = new Scanner(System.in);

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3)
			System.out.println("The largest number is " + num1);
		else if (num2 > num1 && num2 > num3)
			System.out.println("The largest number is " + num2);
		else if (num3 > num1 && num3 > num2)
			System.out.println("The largest number is " + num3);
		else
			System.out.println("Both numbers are equal");

	}

	public static void main(String[] args) {
		Assignment3_Q1 largestnum = new Assignment3_Q1();
		largestnum.largestNum();

	}

}
