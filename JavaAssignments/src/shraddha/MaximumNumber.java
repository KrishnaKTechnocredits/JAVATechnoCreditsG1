//------------------------------------------------------
// Assignment: Maximum and Minimum Number from series.
//------------------------------------------------------

package shraddha;

import java.util.Scanner;

public class MaximumNumber {

	int maximum(int[] number_series) {
		int max = number_series[0];
		for (int index = 0; index < number_series.length; index++) {
			if (number_series[index] > max)
				max = number_series[index];
		}
		return max;
	}

	int minimum(int[] number_series) {
		int min = number_series[0];
		for (int index = 0; index < number_series.length; index++) {
			if (min > number_series[index]) {
				min = number_series[index];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] number_series = new int[5];
		System.out.println("Enter Numbers:= ");
		for (int index = 0; index < number_series.length; index++) {
			number_series[index] = sc.nextInt();
		}
		System.out.println("Max:=" + new MaximumNumber().maximum(number_series));
		System.out.println("Min:=" + new MaximumNumber().minimum(number_series));

	}

}
