package ankush;

//Program to Find duplicate number on Integer array 
public class DuplicateNumberIntArray {

	// Method to Find Duplicate Number from Array Input
	void FindDuplicate(int[] numArray) {
		int temp = 0;
		int[] localArray = new int[5];

		// Loop to Create Local Array
		for (int index = 0; index < numArray.length; index++) {
			temp = numArray[index];
			localArray[temp] = localArray[temp] + 1;
		}

		// Loop to check if Array value is greater than 1
		for (int index = 0; index < localArray.length; index++) {
			if (localArray[index] > 1) {
				System.out.println("Duplicate Number : " + index);
			}
		}

	}

	public static void main(String[] args) {
		InputOperations inputOperations = new InputOperations();
		int[] arr = inputOperations.takeInputsFromUser();
		DuplicateNumberIntArray duplicateNumberIntArray = new DuplicateNumberIntArray();
		duplicateNumberIntArray.FindDuplicate(arr);
	}
}
