package abhishek;

public class DuplicateNumber {
	//Find the maximum value of given array
	static int MaxNumber(int[] x) {
		int max = 0;
		for (int index = 0; index < x.length; index++) {
			if (x[index] > max) {
				max = x[index];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] array1 = { 3, 4, 5, 7, 3, 9 };
		
		int size = MaxNumber(array1);
		int[] array2 = new int[size+1];
		for (int index = 0; index < array1.length ; index++) {

				array2[array1[index]] = array2[array1[index]] + 1;
                System.out.println("array2 index of "+array1[index]+ "  " + array2[array1[index]]);
			}
			

		}
}
