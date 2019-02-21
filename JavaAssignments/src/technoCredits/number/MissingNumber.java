package technoCredits.number;

public class MissingNumber {

	public static void missingNumber() {
		int input[] = { 1, 3, 5, 9 };

		// Gives the Max Value From the Array.
		int max = FindMaxNumber.findMaxNumber(input);

		// Initialized the array's size.
		int array[] = new int[++max];

		// set input array's "value" in new array's
		for (int i = 0; i < input.length; i++) {
			/**
			 * int temp = input[i]
			 * 
			 * give's the value 1,3,5,9 we are going to set this value in new array index
			 * [0, 1, 0, 3, 0, 5, 0, 0, 0, 9] like this
			 * 
			 * arr[temp] = temp;
			 * 
			 */
			array[input[i]] = input[i];
		}

		// abstract arr array to check missing value.
		for (int i = 1; i < array.length; i++) {
			if (array[i] == 0) {
				System.out.println(i);
			}
		}
	}
}
