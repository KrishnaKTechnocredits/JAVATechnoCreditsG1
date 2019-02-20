//--------------------------------------------------------------------------------------------------
//Write a java program to check the equality of two arrays? 
//Hint: Input Arrays : First Array : [21, 57, 11, 37, 24] Second Array : [21, 57, 11, 37, 24] Two Arrays Are Equal 
//--------------------------------------------------------------------------------------------------

package shraddha;

import java.util.Scanner;

public class EqualArray {

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

	void equalArray(int[] array_1, int[] array_2) {
		// TODO Auto-generated method stub

		if (array_1.length == array_2.length) {
			for (int index = 0; index <= array_1.length - 1; index++) {
				if (array_1[index] != array_2[index]) {
					break;
				}
			}
			System.out.println("Two Arrays Are Equal");
		} else
			System.out.println("Two Array are Not Equal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualArray e = new EqualArray();
		System.out.println("ARRAY 1:");
		int[] array_1 = e.acceptNumberSeries();
		System.out.println("ARRAY 2:");
		int[] array_2 = e.acceptNumberSeries();
		e.equalArray(array_1, array_2);
	}

}
