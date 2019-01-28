package abhishek;

public class ArrayContainsNumber {
	//boolean by default value is false
	
	static boolean Flag ;

	// Find the maximum value of given array
	
	static void checkNumberPresnt(int[] x, int number) {

		for (int index = 0; index < x.length; index++) {

			if (x[index] == number) {
				Flag = true;
				break;
			} 

		}
		if (Flag) {

			System.out.println(number + "  is in array");
		} else {
			System.out.println(number + " is not in  array");
		}

	}

	public static void main(String[] args) {
		int[] Given = { 2, 5, 9, 7, 4, 6 };
		checkNumberPresnt(Given, 8);

	}

}
