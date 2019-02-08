package ankush;

//Program to find missing number in integer array
public class MissingNumberIntArray {

	int missingNumber(int[] numArray) {
		int actualCnt = 0;
		int expectedCnt = ((numArray.length + 1) * (numArray.length + 2)) / 2;

		// Loop to calculate actual sum of array values
		for (int index = 0; index < numArray.length; index++) {
			actualCnt = actualCnt + numArray[index];
		}
		// return Expected - Actual Count
		return expectedCnt - actualCnt;
	}

	public static void main(String[] args) {
		InputOperations inputOperations = new InputOperations();
		int[] arr = inputOperations.takeInputsFromUser();
		MissingNumberIntArray numArray = new MissingNumberIntArray();
		int cnt = numArray.missingNumber(arr);
		System.out.println("Missing Number from Integer Array : " + cnt);
	}
}
