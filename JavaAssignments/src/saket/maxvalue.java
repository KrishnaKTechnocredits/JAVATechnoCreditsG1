package saket;

public class maxvalue {

	public static void main(String[] args) {

		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		int max = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				if (arr1[i] > arr2[i])
					System.out.println("Values are not matching at index " + i + " from " + "(" + arr1[i] + ","
							+ arr2[i] + ")" + " and max is " + arr1[i]);
				else {
					System.out.println("Values are not matching at index " + i + " from " + "(" + arr1[i] + ","
							+ arr2[i] + ")" + " and max is " + arr2[i]);
				}
			}
		}

	}
}
