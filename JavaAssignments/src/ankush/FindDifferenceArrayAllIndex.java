package ankush;

// Program to find all differ index from given arrays
public class FindDifferenceArrayAllIndex {

	void findDifferentIndex(int[] array1, int[] array2) {

		// Loop to compare every element from 1st array with second array
		for (int index = 0; index < array1.length; index++) {
			if (array1[index] != array2[index]) {
				System.out.println("Values are not matching at index -> " + index);
			}
		}
	}

	public static void main(String[] args) {
		InputOperations inputOperations = new InputOperations();
		int[] inputArray1 = inputOperations.takeInputsFromUser();
		int[] inputArray2 = inputOperations.takeInputsFromUser();
		FindDifferenceArrayAllIndex findDiffArrayValue = new FindDifferenceArrayAllIndex();
		findDiffArrayValue.findDifferentIndex(inputArray1, inputArray2);
	}
}
