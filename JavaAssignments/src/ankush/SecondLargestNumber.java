package ankush;

// Program to find second largest element in an array of integers

public class SecondLargestNumber {
	void checkSecondLargestNumber(int[] localarray) {
		int maxValue = localarray[0];
		int secondMax = 0;
		
		// Loop to calculate max value and store it in second max and maxvalue variable
		for (int index = 1; index < localarray.length; index++) {
			if (localarray[index] > maxValue) {
				secondMax = maxValue;
				maxValue = localarray[index];
			} 
			// Loop to compare secondmax value with elements in array whose value is less than maxvalue 
			// If found greater then capture it again
			else if (localarray[index] > secondMax && localarray[index]!=maxValue) {
				secondMax = localarray[index];
			}
		}
		System.out.println("Second Maximum Value : " + secondMax);
	}

	public static void main(String[] args) {
		InputOperations inputOperations = new InputOperations();
		int[] inputarray = inputOperations.takeInputsFromUser();
		SecondLargestNumber numArray = new SecondLargestNumber();
		numArray.checkSecondLargestNumber(inputarray);
	}
}
