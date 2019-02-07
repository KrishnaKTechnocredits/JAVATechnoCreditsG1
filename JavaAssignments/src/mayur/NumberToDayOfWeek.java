package mayur;

import java.util.Scanner;

public class NumberToDayOfWeek 
{

	void numberToDay(int input) 
	{
		switch (input) 
		{
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		NumberToDayOfWeek numberToDayOfWeek = new NumberToDayOfWeek();
		System.out.println("Enter Number :");
		int number = sc.nextInt();
		if (number < 0)
			System.out.println("You have entered value which is smaller than 0");
		else 
		{
			int weekDay = number % 8; // converting user input to day of week
			numberToDayOfWeek.numberToDay(weekDay); // method calling
		}
		sc.close();
	}
}
