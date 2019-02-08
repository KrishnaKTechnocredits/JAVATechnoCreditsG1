package rahulV;

import java.util.Scanner;

public class Assignment3_Q13 {

	int add(int num1, int num2) {
		return num1 + num2;
	}

	double add(double num1, double num2) {
		return num1 + num2;
	}

	String add(String string1, String string2) {
		return string1 + string2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1 = scanner.nextInt();

		System.out.println("Enter num2:");
		int num2 = scanner.nextInt();

		System.out.println("Enter decimal num1:");
		double number1 = scanner.nextDouble();

		System.out.println("Enter decimal num2:");
		double number2 = scanner.nextDouble();

		System.out.println("Enter string1:");
		String string1 = scanner.next();

		System.out.println("Enter string2:");
		String string2 = scanner.next();

		Assignment3_Q13 addition = new Assignment3_Q13();
		System.out.println("Ans is " + addition.add(num1, num2));
		System.out.println("Ans is " + addition.add(number1, number2));
		System.out.println("Ans is " + addition.add(string1, string2));

	}

}
