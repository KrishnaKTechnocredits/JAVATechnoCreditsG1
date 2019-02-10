package saket;

import java.util.Scanner;

public class Weekday {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want the weekday for");
		int num = sc.nextInt();
		int day = num % 7;
		weeks(day);
	}

	static void weeks(int day) {
		int result;

		switch (day) {

		case 0:
			System.out.println("Given day will come on sunday");
			break;
		case 1:
			System.out.println("Given day will come on monday");
			break;
		case 2:
			System.out.println("Given day will come on tuesday");
			break;
		case 3:
			System.out.println("Given day will come on wednusday");
			break;
		case 4:
			System.out.println("Given day will come on thusday");
			break;
		case 5:
			System.out.println("Given day will come on friday");
			break;
		case 6:
			System.out.println("Given day will come on saturday");
			break;
		default:
			System.out.println("Kindly Enter valid input");
		}
	}

}
