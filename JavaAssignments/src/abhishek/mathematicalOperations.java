package abhishek;

public class mathematicalOperations {

	static int Sum(int a, int b) {

		return a + b;

	}

	static int substract(int a, int b) {

		return a - b;

	}

	static int multiply(int a, int b) {

		return a * b;

	}

	static float divide(float a, float b) {

		return a / b;

	}

	static int reminder(int a, int b) {

		return a % b;

	}
	
	public static void main(String[] args) {
		
	System.out.println(divide(50, 100)+" "+multiply(50, 100)+" "+Sum(50, 100)+" "+reminder(50, 100)+" "+substract(50, 100));
		
	}
}
