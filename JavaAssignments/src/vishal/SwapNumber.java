package vishal;

public class SwapNumber {
	public void swapNos(int num1, int num2) {
		System.out.println("Value of num1 and num2 before swapping " + num1 + num2);
		// System.out.println("Value of num2 before swapping " + num2);

		int num3;
		num3 = num1;
		num1 = num2;
		num2 = num3;

		System.out.println("Value of num1 and num2 after swapping " + num1 + num2);
		// System.out.println("Value of num2 after swapping " + num2);

	}

	public static void main(String[] args) {
		SwapNumber sn = new SwapNumber();
		sn.swapNos(5, 2);

	}

}
