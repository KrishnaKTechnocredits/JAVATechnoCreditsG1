package vishal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQ5 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		// Scanner sc = new Scanner(System.in);// Infinite loop

		for (int i = 0; i < arr.length; i++) {
			while (true) {
				System.out.println("Enter Integer Value: ");
				try {
					Scanner sc = new Scanner(System.in); // Run as expected
					int input = sc.nextInt();
					if (input <= 100) {
						arr[i] = input;
						break;
					} else {
						System.out.println("Enter less than 100");
					}
				} catch (InputMismatchException e) {
					System.out.println("Please Enter Integer Input");

				}
			}

		}
		System.out.println("First 5 numbers between 1 to 100 are: ");
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}
	}

}
