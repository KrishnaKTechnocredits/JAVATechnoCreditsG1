package vishal;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		ArmstrongNumber an = new ArmstrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int input = sc.nextInt();
		int result = an.checkArmstrong(input);

		if (result == input) {
			System.out.println("Number is Armstrong");
		}

		else {
			System.out.println("Number is not Armstrong");
		}
	}

	public int checkArmstrong(int num) {
		int sum = 0;
		int temp;

		while (num > 0) {
			temp = num % 10;
			num = num / 10;
			sum = sum + temp * temp * temp;
		}
		return sum;
	}

}
