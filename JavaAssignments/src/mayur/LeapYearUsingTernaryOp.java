//program to find leap year using ternary operator


package mayur;

import java.util.Scanner;

public class LeapYearUsingTernaryOp 
{
	boolean isLeapYearUsingTernaryOperator(int year) 
	{
		return ((year % 400 == 0) && (year % 4 == 0)) ? true : (year % 100 == 0) ? false : false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check if it's leap year or not:");
		int year = sc.nextInt();
		LeapYearUsingTernaryOp leapYearUsingTernaryOp = new LeapYearUsingTernaryOp();
		boolean status = leapYearUsingTernaryOp.isLeapYearUsingTernaryOperator(year);
		if (status == true)
			System.out.println("Year " + year + " is leap year");
		else
			System.out.println("Year " + year + " is not leap year");

		sc.close();
	}

}
