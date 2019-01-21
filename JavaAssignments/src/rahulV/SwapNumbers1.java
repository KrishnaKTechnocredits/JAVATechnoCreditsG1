package rahulV;

public class SwapNumbers1 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 20; // first and second variables
		System.out.println("---before swap---");

		System.out.println("First Number: " + num1);
		System.out.println("Second Number: " + num2);

		int num3; // third variable

		num3 = num1; // value of first variable is assigned to third
		num1 = num2; // value of second is assigned to first
		num2 = num3; //// value of third is assigned to second

		System.out.println("---after swap---");
		System.out.println("First Number: " + num1);
		System.out.println("Second Number: " + num2);
	}

}
