//-------------------------------------------------------------------------------------------------------------------------
//Assignment: Write a java program to print the sum, sub, multiply, divide and remainder of two numbers given by users.
//-------------------------------------------------------------------------------------------------------------------------

package shraddha;

public class MathOperations {

	// -----ADDITION OPERATION--------
	double addition(double number_1, double number_2) {
		double addition_result = number_1 + number_2;
		return addition_result;

	}

	// -----SUBTRACTION OPERATION--------
	double subtraction(double number_1, double number_2) {
		double sub_result = number_1 - number_2;
		return sub_result;

	}

	// -----MULTIPLICATION OPERATION--------
	double multiplication(double number_1, double number_2) {
		double mul_result = number_1 * number_2;
		return mul_result;

	}

	// -----DIVISION OPERATION--------
	double division(double number_1, double number_2) {
		double div_result = 0;
		if (number_2 != 0) {
			div_result = number_1 / number_2;
		}

		return div_result;

	}

	// -----DISPLAY RESULTS--------
	void display(double num_1, double num_2) {
		System.out.println("Addition Result: " + addition(num_1, num_2));
		System.out.println("Subtraction Result: " + subtraction(num_1, num_2));
		System.out.println("Multiplication Result: " + multiplication(num_1, num_2));
		System.out.println("Division Result: " + division(num_1, num_2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathOperations mo = new MathOperations();
		mo.display((Double.parseDouble(args[0])), (Double.parseDouble(args[1])));

	}

}
