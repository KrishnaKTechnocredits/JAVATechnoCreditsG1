/*----------------------------------------------------------------------
 * Assignment: WAP to sum of two array
a. firstArray :- {1, 5, 9, 3, 7}
b. secondAraay:- {1, 7, 9, 3}
c. output :- 45
 ----------------------------------------------------------------------*/

package shraddha;

import java.util.Scanner;

public class SunofTwoArrays {
	static Scanner sc = new Scanner(System.in);

	int[] AcceptNos(int[] array) {
		System.out.print("Please enter the " + array.length + " Nos in array: ");
		for (int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
		}
		return array;
	}

	int ArraySum(int[] array) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum = sum + array[index];
		}
		return sum;
	}

	int addition(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {

		System.out.print("Please enter length of first array:= ");
		int array1_size = sc.nextInt();
		System.out.print("Please enter length of second array:= ");
		int array2_size = sc.nextInt();
		int[] array_1 = new int[array1_size];
		int[] array_2 = new int[array2_size];

		SunofTwoArrays s = new SunofTwoArrays();
		System.out.println("Sum of two array is:= "
				+ s.addition(s.ArraySum(s.AcceptNos(array_1)), s.ArraySum(s.AcceptNos(array_2))));
	}
}
