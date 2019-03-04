package ankush;

public class PositiveNegativeNumber {

	void findPositiveNumber(int[] inputArray) {
		String str = "";
		int sum = 0;
		for (int index = 0; index < inputArray.length; index++) {
			if (inputArray[index] > 0 || str == "") {
				str = str + inputArray[index] + " ";
				sum = sum + inputArray[index];
			}

		}
		System.out.println("Positive Numbers = :" + str);
		System.out.println("Positive Numbers Sum = :" + sum);
	}

	void findNegativeNumber(int[] inputArray) {
		String str = "";
		int sum = 0;
		for (int index = 0; index < inputArray.length; index++) {
			if (inputArray[index] < 0 || str == "") {
				str = str + inputArray[index] + " ";
				sum = sum + inputArray[index];
			}

		}
		System.out.println("Negative Numbers = :" + str);
		System.out.println("Negative Numbers Sum = :" + sum);
	}

	public static void main(String[] args) {
		InputOperations inputOperation = new InputOperations();
		int[] inputArray = inputOperation.takeInputsFromUser();

		PositiveNegativeNumber posNegNumb = new PositiveNegativeNumber();
		posNegNumb.findPositiveNumber(inputArray);
		posNegNumb.findNegativeNumber(inputArray);
	}
}
