package ankush;

public class SwapWithThirdVariable {

	// Method to Swap Numbers using third variable
	static void swapNumbers(int firstNumber, int secondNumber) {
		System.out.println("First Number Before Swap : " + firstNumber);
		System.out.println("Second Number Before Swap : " + secondNumber);
		int thirdvar = firstNumber;
		firstNumber = secondNumber;
		secondNumber = thirdvar;
		System.out.println("First Number After Swap : " + firstNumber);
		System.out.println("Second Number After Swap : " + secondNumber);
	}

	public static void main(String[] args) {
		int firstNumber = Integer.parseInt(args[0]);
		int secondNumber = Integer.parseInt(args[1]);
		SwapWithThirdVariable.swapNumbers(firstNumber, secondNumber);

	}
}
