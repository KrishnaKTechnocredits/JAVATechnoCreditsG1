package rahulV;

import java.util.Scanner;

public class Assignment3_Q4 {

	public static void main(String[] args) {
		char operator;
		double num1, num2, result;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter operator: ");
		operator = scanner.next().charAt(0);
		System.out.println("Enter number1 and number2: ");
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();

		switch (operator) {
		case '+':

			result = num1 + num2;
			System.out.println("sum is: " + result);
			break;

		case '-':

			result = num1 - num2;
			System.out.println("Substraction is: " + result);
			break;
		case '*':

			result = num1 * num2;
			System.out.println("multiplication is: " + result);
			break;
		case '/':

			result = num1 / num2;
			System.out.println("division is: " + result);
			break;
		default:

			System.out.println("Invalid operator");

			break;

		}

	}

}
