package rahulV;

import java.util.Scanner;

//WAP to find to number is palindrome or not. 

public class Assignment4_Q11 {

	void palidromrNumber(int num) {
		int original = num;
		int reverse = 0;
		while (num > 0) {
			int reminder = num % 10;
			reverse = (reverse * 10) + reminder;
			num = num / 10;
		}

		if (reverse == original) {
			System.out.println("Given number is palidrome");
		} else {
			System.out.println("Given number is not palidrome");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();

		Assignment4_Q11 pnum = new Assignment4_Q11();
		pnum.palidromrNumber(num);

	}

}
