package rahulV;

import java.util.Scanner;

public class Assignment3_Q5 {

	void printDay() { // method to print day of week
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter week: ");
		int week = scanner.nextInt();
		week = week % 7;
		String day;

		switch (week) {

		case 0:
			day = "Sunday";
			break;
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		default:
			day = "Invalid day";
			break;
		}

		System.out.println("Day is: " + day);

	}

	public static void main(String[] args) {
		Assignment3_Q5 day = new Assignment3_Q5();
		day.printDay();
	}
}