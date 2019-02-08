package vishal;

import java.util.Scanner;

public class TernaryOperator {

	public void getGreaterValue(int val1, int val2) {
		int maxValue = (val1 > val2) ? val1 : val2; // if val1 is greater than
													// val2 then maxValue is
													// assigned value val1 else
													// val2
		System.out.println("Greater No is: " + maxValue);

	}

	public static void main(String[] args) {

		TernaryOperator to = new TernaryOperator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();

		to.getGreaterValue(num1, num2);

	}

}
