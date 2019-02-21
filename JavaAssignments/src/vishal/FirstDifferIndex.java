package vishal;

public class FirstDifferIndex {

	int findDiffIndex(int[] array1, int[] array2) {

		int index;
		for (index = 0; index < array1.length; index++) {

			if (array1[index] != array2[index]) {
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		UserInput ui=new UserInput();
		int[] arr1= ui.enterDataInt();
		int[] arr2= ui.enterDataInt();
		//int[] arr1 = { 10, 2, 9, 14, 3 };
		//int[] arr2 = { 10, 2, 18, 14, 3 };
		FirstDifferIndex fi = new FirstDifferIndex();
		int diffIndex = fi.findDiffIndex(arr1, arr2);
		System.out.println("Values are not matching at index " + diffIndex);

	}

}
