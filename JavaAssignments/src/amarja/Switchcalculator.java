package amarja;
import java.util.Scanner;
//Q4 Program to write calculator program using switch statement
public class Switchcalculator {
	public static void main (String ar[])
		{	 
		System.out.println("Enter two numbers :");
		Scanner sr =new Scanner (System.in);
		double num1=sr.nextDouble();
		double num2=sr.nextDouble();
		System.out.println("Enter Operation to be performed from + ,- ,/,* :");
		char operator=sr.next().charAt(0);
		sr.close();
		Switchcalculator calci =new Switchcalculator();
		calci.calculator(num1, num2, operator);
		}
	void calculator (double num1, double num2,char op)
	{
		double result = 0.0;
		switch(op)
	        {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                result = num1 / num2;
	                break;
	            // operator doesn't match any of the specified operators (+, -, *, /)
	            default:
	                System.out.printf("Error! operator is not correct");
	                return;
	        }
		System.out.println(num1+"" + op+""+ num2 + "=" +result);
	}
	}
