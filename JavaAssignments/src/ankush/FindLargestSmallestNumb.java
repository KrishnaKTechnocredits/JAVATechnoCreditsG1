package ankush;

// Program to find second largest element in an array of integers
public class FindLargestSmallestNumb {

	void checkSmallestLargestNumber(int[] inputArray) {
		int maxValue = 0;
		int minValue = inputArray[0];

		/*
		 * Loop to compare max value and store it in maxvalue
		 * variable
		 */
		for (int index = 0; index < inputArray.length; index++) {
			if (maxValue < inputArray[index]) {
				maxValue = inputArray[index];
			}

			/*
			 * Loop to compare min value with elements in array
			 */
			else if (minValue > inputArray[index]) {
				minValue = inputArray[index];
			}
		}
		System.out.println("Maximum Value : " + maxValue);
		System.out.println("Minumum Value : " + minValue);

	}

	public static void main(String[] args) {
		InputOperations inputOperations = new InputOperations();
		int[] inputArray = inputOperations.takeInputsFromUser();
		FindLargestSmallestNumb findLargestSmallestNumb = new FindLargestSmallestNumb();
		findLargestSmallestNumb.checkSmallestLargestNumber(inputArray);
	}
}
