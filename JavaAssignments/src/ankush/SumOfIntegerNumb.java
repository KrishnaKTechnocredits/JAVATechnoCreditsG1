package ankush;

public class SumOfIntegerNumb {

	void sumOfGivenNumb(int input) {
		int sum = 0;

		while (input % 10 != 0) {
			sum = sum + (input % 10);
			input = (input / 10);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int input = 159753;
		SumOfIntegerNumb sumOfInt = new SumOfIntegerNumb();
		sumOfInt.sumOfGivenNumb(input);

	}
}
