/*---------------------------------------------------------------------------------------------------
Assignment: Create a User Defined Class Roller Coaster and throw the same Exception as above ”Age
Exception” to check the valid age for a ride. Age greater than 12 is allowed for the ride else print
a proper message that “ You should have come after ----years” . Age greater than 60 is not
allowed for the ride else print a proper message that “ You should have come before years..
----------------------------------------------------------------------------------------------------*/

package shraddha;

import java.util.Scanner;

public class RollerCoaster {

	void RideAge(int age) {
		if (age >= 12) {
			System.out.println("Welcome take a ride!!!");
		} else if (age < 12) {
			age = 12 - age;
			System.out.println("Sorry... You should have come after " + age + " years");
		} else if (age > 60) {
			System.out.println("Sorry... You should have come before years..");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter age of client wanna take a ride:= ");
		int age = sc.nextInt();
		RollerCoaster b = new RollerCoaster();
		b.RideAge(age);

	}
}
