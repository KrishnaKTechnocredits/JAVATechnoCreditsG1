// Java Program and create Calculator using switch statement 
package mayur;

import java.util.Scanner;

public class CalculatorSwitchCase 
{
	int addition(int value1, int value2) 
	{
		return value1 + value2; // return addition of value1 and value2
	}

	int subtraction(int value1, int value2)

	{
		return value1 - value2;// return subtraction of value1 and value2
	}

	int multiplication(int value1, int value2) 
	{
		return value1 * value2;// return multiplication of value1 and value2
	}

	int division(int value1, int value2) 
	{
		return value1 / value2;// return division of value1 and value2
	}

	int remainder(int value1, int value2) 
	{
		return value1 % value2;// return remainder of value1 and value2
	}

	void operations() 
	{
		System.out.println("Enter Two numbers:");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		System.out.println("Please enter \n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Remainder");
		int choice = sc.nextInt();
		switch (choice) 
		{
		case 1:
			System.out.println("Addition is  " + addition(number1, number2));
			break;

		case 2:
			System.out.println("Subtraction is :" + subtraction(number1, number2));
			break;

		case 3:
			System.out.println("Multiplication is :" + multiplication(number1, number2));
			break;

		case 4:
			System.out.println("Division is :" + division(number1, number2));
			break;

		case 5:
			System.out.println("Remainder is :" + remainder(number1, number2));
			break;

		default:
			System.out.println("You have entered invalid number");
		}
		sc.close();
	}

	public static void main(String[] args) 
	{
		CalculatorSwitchCase calculatorSwitchCase = new CalculatorSwitchCase();
		calculatorSwitchCase.operations();
	}
}
