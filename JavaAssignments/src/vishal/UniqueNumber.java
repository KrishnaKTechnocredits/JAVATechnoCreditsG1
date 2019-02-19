package vishal;

public class UniqueNumber {
	static int count = 0;

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 2, 5 };
		int[] arr2 = { 5, 6, 7, 8, 9, 7 };
		int length = arr1.length + arr2.length;
		int[] uniqueArray = new int[length];


		for (int i = 0; i < arr1.length; i++) {
			setElement(uniqueArray, arr1[i]);

		}
		
		for (int j = 0; j < arr2.length; j++) {
			setElement(uniqueArray, arr2[j]);

		}

		displayIntArray(uniqueArray);

	}

	static void setElement(int[] uniqueArray, int temp) {
		boolean state = false;

		for (int j = 0; j < uniqueArray.length; j++) {

			if (uniqueArray[j] == temp) {
				state = true;
				break;
			}
		}
			if (state == false) {
				uniqueArray[count] = temp;
				count = count+1;
			}}
		
	

	static void displayIntArray(int[] uniqueArray) {

		for (int i = 0; i < uniqueArray.length; i++) {

			if (uniqueArray[i] != 0)
				System.out.println(uniqueArray[i]);
		}

	}
}