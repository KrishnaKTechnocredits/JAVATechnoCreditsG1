package ankush;

//Program to check equality of two arrays
public class EqualityOfArray {

	void checkEquality(int[] array1, int[] array2) {
		int count = 0;
		
		//For Loop to compare both array elements
		for (int index = 0; index < array1.length; index++) {
			if (array1[index] == array2[index]) {
				count++;
			}
		}
		
		//Condition to check if both arrays are equal or not
		if (count == array1.length) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}

	public static void main(String[] args) {
		InputOperations inputOperations = new InputOperations();
		int[] inputArray1 = inputOperations.takeInputsFromUser();
		int[] inputArray2 = inputOperations.takeInputsFromUser();
		EqualityOfArray equalityOfArray = new EqualityOfArray();
		equalityOfArray.checkEquality(inputArray1, inputArray2);
	}
}
