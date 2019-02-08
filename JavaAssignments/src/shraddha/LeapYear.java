//-----------------------------------------------------------------------------------------------------------------
//Assignment: Write a Java program that takes a year from user and print whether that year is a leap year or not
//-----------------------------------------------------------------------------------------------------------------

package shraddha;

import java.util.Scanner;

public class LeapYear {

	void leapYear(int year) {
		boolean flag = false;
		String result;

		if ((year % 4) == 0) {
			if ((year % 100) == 0 && (year % 400) == 0) {
				flag = true;
			}
			flag = true;
		} else {
			flag = false;
		}

		result = (flag == true) ? "Is a Leap Year!!!.." : "Is Not a Leap Year.";
		System.out.println(year + " " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = sc.nextInt();
		new LeapYear().leapYear(year);
	}

}
