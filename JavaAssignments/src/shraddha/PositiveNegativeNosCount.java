//---------------------------------------------------------------------
// Assignment: Count of Positive and Negative Nos.
//---------------------------------------------------------------------

package shraddha;

import java.util.Scanner;

public class PositiveNegativeNosCount {
	Scanner sc = new Scanner(System.in);

	// ----------Accepting numbers from user and storing in array-----------
	int[] acceptNumbers() {
		// TODO Auto-generated method stub
		System.out.println("How many numbers you want to Enter: ");
		int array_size = sc.nextInt();
		int number_series[] = new int[array_size];
		System.out.println("Please enter any " + array_size + " numbers:");

		// -------Storing numbers in array-----------
		for (int index = 0; index < number_series.length; index++) {
			number_series[index] = sc.nextInt();
		}
		return number_series;
	}

	void positiveNegativeCount(int[] number_series) {
		int pcount = 0, ncount = 0;
		for (int index = 0; index < number_series.length; index++) {
			if (number_series[index] > 0) {
				pcount = pcount + 1;
			} else {
				ncount = ncount + 1;
			}
		}
		System.out.println(
				"Total " + pcount + " Positive nos in array." + "\n" + "Total " + ncount + " Negative nos in array.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveNegativeNosCount pnc = new PositiveNegativeNosCount();
		pnc.positiveNegativeCount(pnc.acceptNumbers());
	}
}
