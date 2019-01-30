package ankush;

//Program to find max value at differ index
public class FindDifferenceArrayValue {

	void findDifferentIndex(int[] array1, int[] array2) {

		/*
		 * Loop to compare every element from 1st array with second array If
		 * found Not equal at any location then print index location and value
		 */

		for (int index = 0; index < array1.length; index++) {
			if (array1[index] != array2[index]) {
				System.out.println("Values are not matching at index -> " + index);
				if (array1[index] > array2[index]) {
					System.out.println(
							"From (" + array1[index] + "," + array2[index] + ") max value is " + array1[index]);
				} else {
					System.out.println(
							"From (" + array1[index] + "," + array2[index] + ") max value is " + array2[index]);
				}
			}
		}
	}

	public static void main(String[] args) {
		InputOperations inputOperations = new InputOperations();
		int[] inputArray1 = inputOperations.takeInputsFromUser();
		int[] inputArray2 = inputOperations.takeInputsFromUser();
		FindDifferenceArrayValue findDiffArrayValue = new FindDifferenceArrayValue();
		findDiffArrayValue.findDifferentIndex(inputArray1, inputArray2);
	}
}
