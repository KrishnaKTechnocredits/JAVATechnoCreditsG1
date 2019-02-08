package amarja;
import java.util.Scanner;
/*Create a class Addition and write add method for:a) add two integers b) add two decimal c) add two String*/
public class Addition {
	int add (int no1,int no2)
	{
		return no1+no2;
	}
	double add (double no1,double no2)
	{
		return no1+no2;
	}
	String add (String s1,String s2)
	{
		return s1+s2;
	}
	public static void main (String args[])
	{
		System.out.println("Select Option : 1:Addition of int 2: Addition of decimal 3:Addition of string");
		Addition a = new Addition ();
		Scanner sr = new Scanner (System.in);
		int menu=sr.nextInt();
		switch (menu)
		{
		case 1:
				System.out.println("Enter 2 integer numbers");
				int no1=sr.nextInt();
				int no2=sr.nextInt();
				System.out.println("Sum of Two Integers =" + a.add(no1,no2));
				break;
		case 2:
				System.out.println("Enter 2 decimal numbers");
				double num1=sr.nextDouble();
				double num2=sr.nextDouble();
				System.out.println("Sum of Two Decimal numbers =" + a.add(num1,num2));
				break;
		case 3:
				System.out.println("Enter 2 String");
				String s1=sr.next();
				String s2=sr.next();
				System.out.println("Sum of Two Strings =" + a.add(s1,s2));
				break;
		default:
				System.out.println("Error Incorrect menu selected");
				break;
		}			
	}
}
