package ankush;

public class Calculator {
	
	//Method to Add Numbers
	static void sum(int number1, int number2) {
		System.out.println("Addition of given numbers is : " + (number1 + number2));
	}
	
	//Method to Multiply Numbers
	static void multiply(int number1, int number2) {
		System.out.println("Multiplication of given numbers is : " + (number1 * number2));
	}

	//Method to Subs Numbers
	static void substract(int number1, int number2) {
		System.out.println("Substraction of given numbers is : " + (number1 - number2));
	}

	//Method to Divide Numbers
	static void divide(int number1, int number2) {
		System.out.println("Division of given numbers is : " + (number1 / number2));
	}

	//Method to get remainder
	static void remainder(int number1, int number2) {
		System.out.println("Remainder of given numbers is : " + (number1 % number2));
	}

	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		sum(number1, number2);
		multiply(number1, number2);
		substract(number1, number2);
		divide(number1, number2);
		remainder(number1, number2);
	}
}
