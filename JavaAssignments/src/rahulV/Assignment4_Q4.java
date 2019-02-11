package rahulV;

import java.util.Scanner;

//WAP to find sum of user given number.

public class Assignment4_Q4 {

	void sumOfGivenNumber(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}

		System.out.println(sum);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int num = scanner.nextInt();

		Assignment4_Q4 sum = new Assignment4_Q4();
		sum.sumOfGivenNumber(num);

	}

}
