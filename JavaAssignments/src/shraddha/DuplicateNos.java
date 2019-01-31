//Find duplicate number on Integer array in Java? 
//Hint: There is exactly one number is repeated in the array. 
//You need to write a program to find that duplicate number. 
//For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3. 
//---------------------------------------------------------------------------------------------------------

package shraddha;

import java.util.Scanner;

public class DuplicateNos {

	// Accepting the number series
	int[] acceptNumberSeries() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number Range: ");
		int numberRange = sc.nextInt();
		int[] number_series = new int[numberRange];

		System.out.println("Please enter the " + numberRange + " numbers in a series: ");
		for (int index = 0; index < number_series.length; index++) {

			number_series[index] = sc.nextInt();
		}

		return number_series;
	}

	// Solution 1: finding duplicates in and array
	void duplicate_Nos(int[] number_series) {
		// int max = new MaximumNumber().maximum(number_series);
		int[] duplicate_numbers = new int[number_series.length];
		for (int index = 0; index < number_series.length; index++) {
			duplicate_numbers[number_series[index]] = duplicate_numbers[number_series[index]] + 1;
		}

		for (int index = 0; index < duplicate_numbers.length; index++) {
			if (duplicate_numbers[index] > 1) {
				System.out.println("No is duplicate:" + index);
			}
		}
	}

	// Solution 2: finding duplicates in an array.
	void duplicate_Nos_1(int[] number_series) {

		System.out.println("Duplicate nos:");
		for (int index = 0; index < number_series.length - 1; index++) {
			for (int index_1 = index + 1; index_1 <= number_series.length - 1; index_1++) {
				if (number_series[index] == number_series[index_1]) {
					System.out.println(number_series[index] + " ");
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateNos dmn = new DuplicateNos();
		dmn.duplicate_Nos_1(dmn.acceptNumberSeries());
		dmn.duplicate_Nos(dmn.acceptNumberSeries());

	}

}
