package saket;

public class ArrayAverage {

	public static void main(String[] args) {

		int[] a = { 14, 32, 19, 14, 78, 36 };

		Average(a);

	}

	static void Average(int[] array) {

		int sum = 0;
		int average = 0;

		for (int i = 0; i < array.length; i++) {

			sum = sum + array[i];
			average = sum / array.length;

		}

		System.out.println("Average is " + average);

	}

}
