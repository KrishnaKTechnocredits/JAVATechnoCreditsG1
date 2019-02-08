package vishal;

import java.util.Scanner;

public class SwitchCalculator {

	public void calculator(String operation, int num1, int num2) {
		int result = 0;
		switch (operation) {
		case "Add":
			result = num1 + num2;
			System.out.println("Addition of given number is " + result);
			break;
		case "Sub":
			result = num1 - num2;
			System.out.println("Substraction of given number is " + result);
			break;
		case "Mult":
			result = num1 * num2;
			System.out.println("Multipication of given number is " + result);
			break;
		case "Div":
			result = num1 / num2;
			System.out.println("Multipication of given number is " + result);
			break;

		default: {
			System.out.println("You have entered invalid opeartion: We support only Add,Sub,Mult or Div");
		}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Operation you want to perform like Add,Sub,Mult,Div");
		String operation = sc.next();
		System.out.println("Enter value 1");
		int num1 = sc.nextInt();
		System.out.println("Enter value 2");
		int num2 = sc.nextInt();

		SwitchCalculator cal = new SwitchCalculator();
		cal.calculator(operation, num1, num2);

	}

}
