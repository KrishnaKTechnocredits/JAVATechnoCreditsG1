package amarja;

import java.util.Scanner;

/*2) Write code to generate and catch an ArrayIndexOutOfBoundsException.
 */
public class Exception2 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);// Step 1:Method to read the integer
											// // array
		Exception2 ex1 = new Exception2();
		int input[] = ex1.input(sr);
		System.out.println("Array values are:");
		for (int index = 0; index < input.length; index++)
			System.out.println(input[index]);
		System.out.println("Program ends");
	}

	int[] input(Scanner sr) { // Reading the input
		System.out.println("Enter size of array");
		int size = sr.nextInt();
		System.out.println("Enter values of array");
		int input[] = new int[size];
		try {
			for (int index = 0; index <= size; index++) // Created ArrayIndex
														// oUT OF BOUND
														// EXCEPTION
				input[index] = sr.nextInt();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index value for array should be less than size of array");
			e.printStackTrace();
		}
		return input;
	}

}
