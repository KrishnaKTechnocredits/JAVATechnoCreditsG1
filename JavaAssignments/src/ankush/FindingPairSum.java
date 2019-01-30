package ankush;

// Program to find all pairs on integer array whose sum is equal to given number
public class FindingPairSum {

	void findPairMatchingSum(int[] array, int number) {
		int temp = 0;

		/*
		 * Loop to calculate sum of array element and compare with the number
		 * enter if found equal then print that pair
		 */
		for (int index = 0; index < array.length; index++) {
			for (int count = index + 1; count < array.length; count++) {
				temp = array[index] + array[count];
				if (temp == number) {
					System.out.println("Integer Number, whose sum is equal to value : " + number);
					System.out.println("(" + array[index] + "," + array[count] + ")");
				}
			}
		}
	}

	public static void main(String[] args) {
		InputOperations inputOperations = new InputOperations();
		int[] inputArray = inputOperations.takeInputsFromUser();
		int number = inputOperations.takeNumberInput();
		FindingPairSum findingPairSum = new FindingPairSum();
		findingPairSum.findPairMatchingSum(inputArray, number);
	}
}
