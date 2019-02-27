package ankush;

public class SumOfTwoArray {

	int calcSumOfArray(int firstArray[]) {
		int temp = 0;

		for (int index = 0; index < firstArray.length; index++) {
			temp = temp + firstArray[index];
		}

		return temp;
	}

	public static void main(String[] args) {
		int firstArray[] = { 1, 5, 9, 3, 7 };
		int secondArray[] = { 1, 7, 9, 3 };
		SumOfTwoArray sumOfArray = new SumOfTwoArray();
		int firstSum = sumOfArray.calcSumOfArray(firstArray);
		int secondSum = sumOfArray.calcSumOfArray(secondArray);
		System.out.println("Sum of two Array :" + (firstSum + secondSum));

	}
}
