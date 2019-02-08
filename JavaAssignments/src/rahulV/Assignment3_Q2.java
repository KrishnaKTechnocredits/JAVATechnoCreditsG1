package rahulV;

import java.util.Scanner;

public class Assignment3_Q2 {

	public static void main(String[] args) {
		int num1, num2, greaterNum;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter num1: ");
		num1 = scanner.nextInt();
		
		System.out.println("Enter num2: ");
		num2 = scanner.nextInt();
		
		if (num1 == num2) {
			System.out.println("Both number are Equal");
		} else {
			greaterNum = (num1 > num2) ? num1 : num2;
			System.out.println("Greater number is "+greaterNum);
		}

	}

}
