package shraddha;

import java.util.Scanner;

public class CalculatorSwitchCase {

	void calculator() {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		char operation = ' ';

		while (operation != 'Q' && operation != 'q') {
			System.out.print("Enter number1: ");
			num1 = sc.nextInt();
			System.out.print("Enter number2: ");
			num2 = sc.nextInt();
			System.out.print("Enter math operation to perform, Orelse press Q to exit. ");
			operation = sc.next().charAt(0);

			switch (operation) {
			case '+':
				result = (num1 + num2);
				break;
			case '-':
				result = (num1 - num2);
				break;
			case '/':
				result = ((num1 == 0) || (num2 == 0)) ? 0 : (num1 > num2) ? (num1 / num2) : (num1 / num2);
				break;
			case '*':
				result = (num1 * num2);
				break;
			case '%':
				result = ((num1 == 0) || (num2 == 0)) ? 0 : (num1 > num2) ? (num1 % num2) : num1;
				break;
			case 'Q':
				break;
			case 'q':
				break;

			default:
				System.out.println("You have entered the Wrong option\n");
				System.out.println("Please enter the Correct operator such as +, -, *, /, %");
				break;
			}

			if (operation != 'Q' && operation != 'q') {
				System.out.println(" Result of " + num1 + operation + num2 + " is: " + result);
			} else {
				System.out.println("Exiting Byee....!!");
				break;
			}
		}

	}

	public static void main(String[] args) {
		new CalculatorSwitchCase().calculator();
	}

}
