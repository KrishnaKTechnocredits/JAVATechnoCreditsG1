package saket;

import java.util.Scanner;

public class switchcal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");

		int firstnum = sc.nextInt();

		System.out.println("Enter the Second number");

		int secondnum = sc.nextInt();

		System.out.println("Enter the Operation you want to perform on given number +,-,*,/");

		String Calculator = sc.next();

		calci(firstnum, secondnum, Calculator);

	}

	static void calci(int a, int b, String Calculator) {
		int result;

		switch (Calculator) {

		case ("+"):
			result = a + b;
			System.out.println("Sum of two number is " + result);
			break;
		case ("-"):
			result = a - b;
			System.out.println("subtraction of two number is " + result);
			break;
		case ("*"):
			result = a * b;
			System.out.println("multiplication of two number is " + result);
			break;
		case ("/"):
			result = a / b;
			System.out.println("Division of two number is " + result);
			break;
		default:
			System.out.println("Kindly Enter valid input");
		}
	}

}
