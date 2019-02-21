package abhishek;

public class SecondLargestElement {
	static int secmaxnumber(int[] x) {
		int max = 0;
		int secondmax = 0;
		for (int index = 0; index < x.length; index++) {
			if (x[index] > max) {
				secondmax = max;
				max = x[index];

			}
		}
		return secondmax;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		int SecondLargestElement = secmaxnumber(array1);
		System.out.println(SecondLargestElement);
	}
}