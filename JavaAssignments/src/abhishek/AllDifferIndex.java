package abhishek;

public class AllDifferIndex {
	static void differindex(int[] arr1, int[] arr2) {
		 if (arr1.length-arr2.length< 0) {
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index]) {

				System.out.println("Values are not matching at index -> " + index);
		
			}

		
		
		}
		}
		 else {
			for (int index1 = 0; index1 < arr1.length; index1++) {
			if (arr1[index1] != arr2[index1]) {

				System.out.println("Values are not matching at index -> " + index1);
		
			}

		 
		}}}

	public static void main(String[] args) {
		int[] arr1 = { 10,2,9,14,3};
		int[] arr2 = { 10,2,18,14,13};
		differindex(arr1, arr2);

	}
}


