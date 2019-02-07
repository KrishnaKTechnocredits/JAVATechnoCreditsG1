package amarja;
import java.util.Scanner;
//Q5 Program to generate integer between number 1 and 7 to display the weekday
public class Switchweekday {
	void findweekday (int num1)
	{
		System.out.println("case"+num1);
		switch(num1)
		        {
	            case 0:
	                System.out.println("Sunday");
	                break;
	            case 1:
	            	System.out.println("Monday");
	                break;
	            case 2:
	            	System.out.println("Tuesday");
	                break;
	            case 3:
	            	System.out.println("Wednesday");
	                break;
	            case 4:
	            	System.out.println("Thursday");
	                break;
	            case 5:
	            	System.out.println("Friday");
	                break;
	            case 6:
	            	System.out.println("Saturday");
	                break;
	            // operator doesn't match any of the specified operators (+, -, *, /)
	            default:
	                System.out.println("Error! No such weekday");
	                return;
	        }
	}
	public static void main(String args[])
	{
			System.out.println("Enter number to be converted in weekday");
			Scanner sr =new Scanner (System.in);
			int num1=sr.nextInt();
			System.out.println("numer"+num1);
			sr.close();
			if (num1>6)
			num1=num1%7;
			Switchweekday sweek= new Switchweekday();
			sweek.findweekday(num1);
	}
}
