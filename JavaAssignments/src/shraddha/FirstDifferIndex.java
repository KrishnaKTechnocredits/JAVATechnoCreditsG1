//--------------------------------------------------------------------------------------------------
//Assignment: Find first differ index from given arrays 
//i/p :- arr1: {10,2,9,14,3} 
//arr2: {10,2,18,14,3} 
//o/p :-Values are not matching at index -> 2 
//--------------------------------------------------------------------------------------------------

package shraddha;

import java.util.Scanner;

public class FirstDifferIndex {

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

	void differIndex(int[] array_1, int[] array_2) {
		// TODO Auto-generated method stub
		for (int index = 0; index <= array_1.length - 1; index++) {
			if (array_1[index] != array_2[index]) {
				System.out.println("Values are not matching at index -> " + index);
				break;
			}
		}
		System.out.println("Values are matching");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstDifferIndex e = new FirstDifferIndex();
		System.out.println("ARRAY 1:");
		int[] array_1 = e.acceptNumberSeries();
		System.out.println("ARRAY 2:");
		int[] array_2 = e.acceptNumberSeries();
		e.differIndex(array_1, array_2);
	}

}
