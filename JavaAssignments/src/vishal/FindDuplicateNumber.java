package vishal;

import java.util.Scanner;

public class FindDuplicateNumber {

	// int[] num = { 3, 3, 4, 4, 6, 6 };

	static int size = 6;

	static int[] temp = new int[size + 1];

	int[] findDuplicate(int[] num) {

		int[] dup = new int[temp.length];

		for (int index = 0; index < num.length; index++) { // This for loop is
															// for setting index
															// value from 0 to 1

			temp[num[index]] = temp[num[index]] + 1;
		}

		for (int count = 0; count < temp.length; count++) { // This loop is for
															// storing multiple
															// duplicate values
			if (temp[count] > 1) {
				dup[count] = count;
			}
		}
		return dup;
	}

	public static void main(String[] args) {

		FindDuplicateNumber fd = new FindDuplicateNumber();
		UserInput ui = new UserInput();
		int[] arr = ui.enterDataInt();//The max value of element should be 6 and array should be of 6 elements, I wrote code for this condition only
		int[] duplicateNo = fd.findDuplicate(arr);
		for (int index = 0; index < temp.length; index++) { // This for loop is
															// to display only
															// duplicate nos of
															// array
			if (duplicateNo[index] > 0) {
				System.out.println("Duplicate No. is: " + duplicateNo[index]);
			}

		}

	}
}