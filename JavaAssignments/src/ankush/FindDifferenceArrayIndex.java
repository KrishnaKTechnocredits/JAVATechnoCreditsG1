package ankush;

//Program to find differ index from given arrays
public class FindDifferenceArrayIndex {

	void findDifferentIndex(int[] array1, int[] array2) {

		/*
		 * Loop to compare every element from 1st array with second array If
		 * found Not equal at any location then come out of loop and print index
		 * location
		 */

		for (int index = 0; index < array1.length; index++) {
			if (array1[index] != array2[index]) {
				System.out.println("Values are not matching at index -> " + index);
				break;
			}
		}
	}

	public static void main(String[] args) {
		InputOperations inputOperations = new InputOperations();
		int[] inputArray1 = inputOperations.takeInputsFromUser();
		int[] inputArray2 = inputOperations.takeInputsFromUser();
		FindDifferenceArrayIndex findDiffArrayValue = new FindDifferenceArrayIndex();
		findDiffArrayValue.findDifferentIndex(inputArray1, inputArray2);
	}
}
