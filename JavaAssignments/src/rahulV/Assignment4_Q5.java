package rahulV;

import java.util.Scanner;

// WAP to reveres user given number 

public class Assignment4_Q5 {

	void reverseNumber(int num) {
		int reverse = 0;
		while (num > 0) {
			int reminder = num % 10;

			reverse = (reverse * 10) + reminder;
			num = num / 10;
		}
		System.out.println("Reverse of given number is " + reverse);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		int num = scanner.nextInt();

		Assignment4_Q5 rev = new Assignment4_Q5();
		rev.reverseNumber(num);

	}

}
