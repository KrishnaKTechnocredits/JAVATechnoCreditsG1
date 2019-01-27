package ankush;

public class SwapWithoutThirdVariable {

	// Method to Swap Numbers without using third Variable
	static void swapNumbersWV(int firstNumber, int secondNumber) {
		System.out.println("First Number Before Swap : " + firstNumber);
		System.out.println("Second Number Before Swap : " + secondNumber);
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		System.out.println("First Number after Swap : " + firstNumber);
		System.out.println("Second Number after Swap : " + secondNumber);
	}

	public static void main(String[] args) {
		int firstNumber = Integer.parseInt(args[0]);
		int secondNumber = Integer.parseInt(args[1]);
		SwapWithoutThirdVariable.swapNumbersWV(firstNumber, secondNumber);

	}
}
