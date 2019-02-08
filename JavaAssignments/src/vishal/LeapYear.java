package vishal;

import java.util.Scanner;

public class LeapYear {

	public boolean checkLeapYear(int year) {
		boolean leapYear = false;

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			leapYear = true;
		}

		return leapYear;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();

		if (year > 1581) {

			LeapYear ly = new LeapYear();
			boolean status = ly.checkLeapYear(year);

			if (status == true) {
				System.out.println("This is leap year");
			} else {
				System.out.println("This is not a leap year");
			}
		} else {
			System.out.println("Year must be greater than 1581");
		}

	}

}
