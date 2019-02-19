package amarja;
import java.util.Scanner;
//Q1 Program to find largest amongst three integer number using Logical AND operator
public class LargestnumAndoperator {
	public static void main(String args[])
	{		
		System.out.println("Enter 3 whole numbers:");//Reading input from user
		Scanner sr =new Scanner(System.in);
		int num1 = sr.nextInt();
		int num2 = sr.nextInt();
		int num3 = sr.nextInt();
		sr.close();
		LargestnumAndoperator tmax=new LargestnumAndoperator();
		if (num1==num2 && num1==num3 && num2==num3)
			System.out.println("Please enter distinct 3 numbers");
		else
		System.out.println("Largest number is "+tmax.findmax(num1,num2,num3));
	}
	int findmax(int num1, int num2, int num3) //method to find maximum using && operator
	{
		int max = 0;
		if (num1>=num2 && num1>=num3)
		max=num1;
		else if (num2>=num1 && num2 >=num3)
		max=num2;
		else if (num3>=num2 && num3>=num1)
		max=num3;
		return max;
	}
}

