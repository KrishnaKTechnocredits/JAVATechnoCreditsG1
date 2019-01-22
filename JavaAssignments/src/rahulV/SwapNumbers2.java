package rahulV;

public class SwapNumbers2 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 20; // first and second variables
		System.out.println("---before swap---");

		System.out.println("First Number: " + num1);
		System.out.println("Second Number: " + num2);

		num1 = num1 + num2; // num1 becomes 30
		num2 = num1 - num2; // num2 becomes 10
		num1 = num1 - num2; // num1 becomes 20

		System.out.println("---after swap---");
		System.out.println("First Number: " + num1);
		System.out.println("Second Number: " + num2);

	}

}
