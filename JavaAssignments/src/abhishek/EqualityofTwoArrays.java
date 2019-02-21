package abhishek;

public class EqualityofTwoArrays {
	static boolean flag = false;
	public static void twoarraysequality(int[] firstarray,int[] secondarray) {
		

		if (firstarray.length == secondarray.length) {

			for (int index = 0; index < secondarray.length; index++) {
				if (firstarray[index] == secondarray[index]) {
					flag = true;

				} else {
					flag = false;
					break;
				}

			}
			if (flag) {
				System.out.println("Two arrays equal");

			} else {
				System.out.println("Two arrays not equal");
			}

		} else {
			System.out.println("Two arrays not equal");
		}

	}

	public static void main(String[] args) {
		int [] Ufirstarray = { 21, 57, 11, 37, 24 };
		int [] Usecondarray = { 21, 57, 11, 37, 24 };
	new EqualityofTwoArrays().twoarraysequality(Ufirstarray, Usecondarray);

	}
}
