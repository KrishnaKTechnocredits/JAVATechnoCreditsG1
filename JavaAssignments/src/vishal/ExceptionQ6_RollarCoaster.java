package vishal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQ6_RollarCoaster {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);// Infinite loop

		System.out.println("Enter Your Age: ");
		try {
			Scanner sc = new Scanner(System.in); // Run as expected
			int age = sc.nextInt();
			if (age <= 12) {
				int remainingAge = 12 - age;
				System.out.println("Grow Up Kid:Come after " + remainingAge + " Years");
			} else if (age >= 60) {
				System.out.println("We know you are still young at heart but You should come some years before.");
			}

			else {
				System.out.println("We wish you all the best: Be ready for your adventure");
			}

		} catch (InputMismatchException e) {
			System.out.println("Please Enter Integer Input");

		}
	}

}
