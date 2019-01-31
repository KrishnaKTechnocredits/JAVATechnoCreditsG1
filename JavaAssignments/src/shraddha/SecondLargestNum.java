package shraddha;

import java.util.Scanner;

public class SecondLargestNum {

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

	void secondHighest(int[] number_series) {
		int max = number_series[0], second_max = number_series[0];

		for (int index = 1; index <= number_series.length - 1; index++) {
			if (number_series[index] > max) {
				second_max = max;
				max = number_series[index];
			}
		}
		System.out.println("Second max number is: " + second_max);
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondLargestNum sln = new SecondLargestNum();
		sln.secondHighest(sln.acceptNumberSeries());
	}

}
