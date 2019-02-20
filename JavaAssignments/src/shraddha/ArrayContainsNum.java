//--------------------------------------------------------------------------
//Assignment: Check if array contains a number in Java? 
//Hint: Your method should accept 2 parameters. Input array and number. 
//i/p :-  arr[] = {2,5,9,7,4,6}  number :- 8 o/p :- number is not in arr. 
//--------------------------------------------------------------------------

package shraddha;

import java.util.Scanner;

public class ArrayContainsNum {

	Scanner sc = new Scanner(System.in);

	// Accepting numbers from user and storing in array
	int[] acceptNumbers() {
		// TODO Auto-generated method stub
		System.out.println("How many numbers you want to Enter: ");
		int array_size = sc.nextInt();
		int number_series[] = new int[array_size];
		System.out.println("Please enter any " + array_size + " numbers:");

		// Storing numbers in array
		for (int index = 0; index < number_series.length; index++) {
			number_series[index] = sc.nextInt();
		}
		return number_series;
	}

	// Accepting number to be searched from user. And searching the number in array.
	boolean searchNumber(int[] number_series) {
		System.out.println("Enter number you wanna search: ");
		int num = sc.nextInt();
		boolean flag = false;

		for (int index = 0; index < number_series.length; index++) {
			if (number_series[index] == num) {
				flag = true;
				break;
			}

		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayContainsNum acn = new ArrayContainsNum();

		if (acn.searchNumber(acn.acceptNumbers()) == true)
			System.out.println("Yupiiii.. Number Found !!! ");
		else
			System.out.println("number is not in arr.");
	}

}
