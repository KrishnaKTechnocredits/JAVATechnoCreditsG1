//program to find leap year

package mayur;

import java.util.Scanner;

public class LeapYear {

	void isLeapYear(int year) {
		if ((year % 400 == 0) && (year % 4 == 0))
			System.out.println("Year " + year + " is leap year");
		else if (year % 100 == 0)
			System.out.println("Year " + year + " is not leap year");
		else
			System.out.println("Year " + year + " not is leap year");

	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check if it's leap year or not:");
		int year = sc.nextInt();
		LeapYear leapYear = new LeapYear();
		leapYear.isLeapYear(year);
		sc.close();
	}
}
