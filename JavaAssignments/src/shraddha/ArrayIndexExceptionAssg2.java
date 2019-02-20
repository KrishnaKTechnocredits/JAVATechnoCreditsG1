/*--------------------------------------------------------------------------------
 * Assignment: Write code to generate and catch an ArrayIndexOutOfBoundsException. 
 ----------------------------------------------------------------------------------*/

package shraddha;

import java.util.Scanner;

public class ArrayIndexExceptionAssg2 {

	static Scanner sc = new Scanner(System.in);

	void ExceptionArrayIndex_Scenario_1(int[] arr) {
		System.out.print("Please enter elements in and integer array: ");
		for (int index = 0; index <= arr.length; index++) {
			arr[index] = sc.nextInt();
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[3];
		ArrayIndexExceptionAssg2 a = new ArrayIndexExceptionAssg2();

		// Scenario 1: index <= Array Length
		try {
			a.ExceptionArrayIndex_Scenario_1(arr);
		} catch (ArrayIndexOutOfBoundsException a1) {
			System.out.println(
					"Please check the array for_loop. Array size is less and you are trying to enter more elements..");
		}
	}
}
