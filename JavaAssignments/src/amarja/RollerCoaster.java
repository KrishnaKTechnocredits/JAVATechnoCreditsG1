package amarja;

import java.util.Scanner;

/*Create a User Defined Class Roller Coaster and throw the same Exception as above ”Age
Exception” to check the valid age for a ride. Age greater than 12 is allowed for the ride else print
a proper message that “ You should have come after ----years” . Age greater than 60 is not
allowed for the ride else print a proper message that “ You should have come before years..
 */

public class RollerCoaster {

	public static void main(String[] args) {
		System.out.println("Enter age to check compatibility for ride");
		Scanner sc = new Scanner(System.in);
		try {
			validateage(sc.nextInt());
		} catch (Exception e) {
			System.out.println("Exception occured");
		} finally {
			sc.close();
		}
		System.out.println("Program ends...");
	}

	public static void validateage(int age) throws InvalidAgeException {

		if (age > 12 && age <= 60)
			System.out.println("Welcome to Ride ZONE");
		else if (age <= 12) {			
			throw new InvalidAgeException("1");
		} else if (age > 60)
			throw new InvalidAgeException("2");
	}

}
