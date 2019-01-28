package abhishek;

public class LargestSmallesNum {
	// To find the largest number
	static int MaxNumber(int[] x) {
		int max = 0;
		for (int index = 0; index < x.length; index++) {
			if (x[index] > max) {
				max = x[index];
			}
		}
		return max;
	}

	// To find the Smallest number
	static int smallestNumber(int[] x) {

		int smallNumber = x[0];
		for (int index = 0; index < x.length; index++) {
			if (x[index] < smallNumber) {

				smallNumber = x[index];

			}
		}
		return smallNumber;
	}

	// Sum of smallest and largest value
	 static int sum(int[] x) {
		return smallestNumber(x) + MaxNumber(x);

	}

	public static void main(String[] args) {

		int[] Userarray = { 7, 8, 9, 10, 1 };
		System.out.println(sum(Userarray));

	}

}
