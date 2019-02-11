package rahulV;

import java.util.Scanner;

////WAP to find to number is Armstrong number or not. 

public class Assignment4_Q13 {

	void armstrongNumber(int num) {
		int result = 0;
		int original = num;
		while (num > 0) {
			int reminder = num % 10;
			result = result + (reminder * reminder * reminder);
			num = num / 10;
		}

		if (result == original) {
			System.out.println("Given number is Armstrong number");
		} else {
			System.out.println("Given number is not Armstrong number");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();

		Assignment4_Q13 anum = new Assignment4_Q13();
		anum.armstrongNumber(num);
	}

}
