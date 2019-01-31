//---------------------------------------------------------------------------------------------------
//Largest and smallest number in unsorted array? 
//Hint: For example, if input integer array is {2, 6, 3, 9, 11} and given sum is 9, output should be {6,3}. 
//---------------------------------------------------------------------------------------------------

package shraddha;

import java.util.Scanner;

public class LargeSmallNum {

	Scanner sc = new Scanner(System.in);

	// Accepting the number series
	int[] acceptNumberSeries() {
		System.out.println("Enter total number Range: ");
		int numberRange = sc.nextInt();
		int[] number_series = new int[numberRange];

		System.out.println("Please enter the " + numberRange + " numbers in a series: ");
		for (int index = 0; index < number_series.length; index++) {
			number_series[index] = sc.nextInt();
		}
		return number_series;
	}

	void largeSmallNum(int[] number_series) {
		System.out.println("Enter sum output/number : ");
		int number = sc.nextInt();
		int min = 0, max = 0;
		for (int num1 = 0; num1 < number_series.length - 1; num1++) {
			for (int num2 = num1 + 1; num2 <= number_series.length - 1; num2++) {
				if ((number == number_series[num1] + number_series[num2]) || (number == number_series[num2] - number_series[num1]) ) {
					if (number_series[num1] <= number_series[num2]) {
						min = number_series[num1];
						max = number_series[num2];
						System.out.println("{" + max + "," + min + "}");
					} else {
						min = number_series[num2];
						max = number_series[num1];
						System.out.println("{" + max + "," + min + "}");
					}
					// break;
				}
			}
		}
		//System.out.println("{" + max + "," + min + "}");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LargeSmallNum lsn = new LargeSmallNum();
		lsn.largeSmallNum(lsn.acceptNumberSeries());

	}

}
