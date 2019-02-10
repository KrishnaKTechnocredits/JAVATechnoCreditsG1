package saket;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");

		int year = sc.nextInt();

		boolean flag = leap(year);

		display(flag);

	}

	static boolean leap(int yr) {
		boolean flag = false;
		if (yr % 4 == 0) {
			flag = true;

		}
		if (yr % 100 == 0) {
			flag = false;
		}
		if (yr % 400 == 0) {
			flag = true;
		}
		return flag;
	}

	static void display(boolean flag) {
		if (flag == true)
			System.out.println("Given Year if a Leap year");
		if (flag == false)
			System.out.println("Given Year is not a Leap year");

	}

}
