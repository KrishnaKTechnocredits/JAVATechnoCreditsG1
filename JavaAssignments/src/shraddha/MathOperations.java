//-------------------------------------------------------------------------------------------------------------------------
//Assignment: Write a java program to print the sum, sub, multiply, divide and remainder of two numbers given by users.
//-------------------------------------------------------------------------------------------------------------------------

package shraddha;

public class MathOperations {

	// -----ADDITION OPERATION--------
	int addition(int number_1, int number_2) {
		int addition_result = number_1 + number_2;
		return addition_result;

	}

	// -----SUBTRACTION OPERATION--------
	int subtraction(int number_1, int number_2) {
		int sub_result = number_1 - number_2;
		return sub_result;

	}

	// -----MULTIPLICATION OPERATION--------
	int multiplication(int number_1, int number_2) {
		int mul_result = number_1 * number_2;
		return mul_result;

	}

	// -----DIVISION OPERATION--------
	int division(int number_1, int number_2) {
		int div_result = 0;
		if (number_2 != 0) {
			div_result = number_1 / number_2;
		}

		return div_result;

	}

	// -----DISPLAY RESULTS--------
	void display(int num_1, int num_2) {
		System.out.println("Addition Result: " + addition(num_1, num_2));
		System.out.println("Subtraction Result: " + subtraction(num_1, num_2));
		System.out.println("Multiplication Result: " + multiplication(num_1, num_2));
		System.out.println("Division Result: " + division(num_1, num_2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathOperations mo = new MathOperations();
		mo.display((Integer.parseInt(args[0])), (Integer.parseInt(args[1])));

	}

}
