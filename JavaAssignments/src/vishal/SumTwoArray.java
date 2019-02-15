package vishal;

public class SumTwoArray {

	public static void main(String[] args) {
		SumTwoArray sta = new SumTwoArray();
		sta.sumArray();
		System.out.println("Sum of two arrays are " + sta.sumArray());

	}

	public int sumArray() {
		int[] firstArray = { 1, 5, 9, 3, 7 };
		int[] secondArray = { 1, 7, 9, 3 };
		int sumfirstArray = 0;
		int sumSecondArray = 0;
		int total;

		for (int index = 0; index < firstArray.length; index++) {
			int value = firstArray[index];
			sumfirstArray = sumfirstArray + value;

		}

		for (int index = 0; index < secondArray.length; index++) {
			int value = secondArray[index];
			sumSecondArray = sumSecondArray + value;

		}
		total = sumfirstArray + sumSecondArray;
		return total;
	}

}
