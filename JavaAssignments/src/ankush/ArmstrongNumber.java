package ankush;

import java.util.Scanner;

public class ArmstrongNumber {

	int checkArmstrongNumber(int number) {
		int temp = 0;
		int cubeSum = 0;
		while (number % 10 != 0) {
			temp = number % 10;
			cubeSum = cubeSum + (temp * temp * temp);

			number = number / 10;
		}
		return cubeSum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = sc.nextInt();

		ArmstrongNumber armStrongNumb = new ArmstrongNumber();
		int cubeSum = armStrongNumb.checkArmstrongNumber(number);

		if (cubeSum == number)

			System.out.println("Number is Armstrong");

		else
			System.out.println("Number is not Armstrong");
		sc.close();
	}
}
