package saket;

public class Arthmaticoperations {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		sum(a, b);
		sub(a, b);
		mul(a, b);
		div(a, b);
		rem(a, b);

	}

	static void sum(int a, int b) {

		int sum = a + b;
		System.out.println("Sum of Two numbers is " + sum);
	}

	static void sub(int a, int b) {

		int sub = a - b;
		System.out.println("subraction of Two numbers is " + sub);

	}

	static void mul(int a, int b) {

		int mul = a * b;
		System.out.println("multiplication of Two numbers is " + mul);

	}

	static void div(int a, int b) {
		int div = a / b;
		System.out.println("division of Two numbers is " + div);
	}

	static void rem(int a, int b) {

		int rem = a % b;
		System.out.println("Remainder of Two numbers is " + rem);
	}

}