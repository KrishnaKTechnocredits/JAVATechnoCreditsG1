/*--------------------------------------------------------------------------------------
Assignment: WAP which fulfill below condition
a. WAP to find positive and negative number from the given array
b. check the sum of individual.
Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
Output :- expected output of
a. positive number = {5, 6, 14, 6, 7}
b. negative number = {-9, -25, -14}
c. positive number sum :- 38
d. negative number sum :- 48
--------------------------------------------------------------------------------------*/
/* Solution applied:
 * 1. Accept nos from user function: ArrayInput, Compare each number with zero function: positiveNegativeNos
 * 2. if(num > 0) --> Positive else Negative no.
 * -------------------------------------------------------------------------------------*/

package shraddha;

import java.util.Scanner;

public class PositiveNegativeSum {

	// function will print positive and negative nos and their respective sum.
	void positiveNegativeNos(int[] numberarray) {
		int positive_sum = 0, negative_sum = 0;
		String positive_nos = "", negative_nos = "";

		for (int index = 0; index < numberarray.length; index++) { // fetching
																	// each no
																	// from
																	// array
			if (numberarray[index] > 0) {
				positive_nos = positive_nos + numberarray[index] + ",";
				positive_sum = positive_sum + numberarray[index];
			} else {
				negative_nos = negative_nos + numberarray[index] + ",";
				negative_sum = negative_sum + numberarray[index];
			}
		}

		positive_nos = positive_nos.substring(0, positive_nos.lastIndexOf(",")); // removing
																					// last
																					// comma
		negative_nos = negative_nos.substring(0, negative_nos.lastIndexOf(","));

		System.out.println("Positive numbers = {" + positive_nos + "}");
		System.out.println("negative numbers = {" + negative_nos + "}");
		System.out.println("positive number sum = " + positive_sum);
		System.out.println("positive number sum = " + negative_sum);
	}

	// Accepting Positive and negative nos from user and returning the array to
	// be used in furthur functions
	int[] ArrayInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter total number count to be entered: ");
		int arraysize = sc.nextInt();
		System.out.print("Please enter " + arraysize + " positive/negative numbers: ");
		int[] numberarray = new int[arraysize];

		for (int index = 0; index < numberarray.length; index++) {
			numberarray[index] = sc.nextInt();
		}

		return numberarray;
	}

	public static void main(String[] args) {

		PositiveNegativeSum p = new PositiveNegativeSum();
		p.positiveNegativeNos(p.ArrayInput());

	}

}
