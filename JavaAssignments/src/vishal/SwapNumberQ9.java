package vishal;

public class SwapNumberQ9 {
	public void swapNumber(int num1, int num2) {
		System.out.println("Value of num1 and num2 before swapping " + num1 + num2);
		num1 = num1 + num2;// 7+5
		num2 = num1 - num2;// num2=12-5=7
		num1 = num1 - num2;// num1=12-7=5
		System.out.println("Value of num1 and num2 after swapping " + num1 + num2);

	}

	public static void main(String[] args) {
		SwapNumberQ9 sn = new SwapNumberQ9();
		sn.swapNumber(7, 5);
	}
}