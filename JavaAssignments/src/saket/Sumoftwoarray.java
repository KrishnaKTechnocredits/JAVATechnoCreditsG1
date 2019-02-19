package saket;

public class Sumoftwoarray {

	public static void main(String[] args) {

		int[] firstArray = { 1, 5, 9, 3, 7 };
		int[] secondAraay = { 1, 7, 9, 3 };

		sum(firstArray, secondAraay);

	}

	static void sum(int[] firstArray, int[] secondAraay) {
		int sum = 0;
		for (int i = 0; i <= firstArray.length - 1; i++) {

			sum = sum + firstArray[i];

		}
		for (int j = 0; j <= secondAraay.length - 1; j++) {
			sum = sum + secondAraay[j];
		}

		System.out.println(sum);
	}

}