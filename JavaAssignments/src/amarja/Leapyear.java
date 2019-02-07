package amarja;
import java.util.Scanner;
//Q3 Program to find whether year input is leap year or not
public class Leapyear {
	boolean findLeapyear(int year)//Year is leap year if its divisble by 4 or its divsible by 100 and 400 evenly
	{	boolean flag= false;
		if (year%4==0 || (year%100==0 && year%400==0))
			flag =true;
		else flag =false;
		return flag;
	}
	public static void main(String args[])
	{
		System.out.println("Enter year in format xxxx:");//Reading input from user
		Scanner sr =new Scanner(System.in);
		int year = sr.nextInt();
		sr.close();
		Leapyear ye=new Leapyear();
		boolean flag=ye.findLeapyear(year);
		if (flag == true)
				System.out.println( year+ " is Leap Year");
		else 
				System.out.println( year+ " is Not a Leap Year");
	}
}
