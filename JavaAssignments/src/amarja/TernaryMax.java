package amarja;
import java.util.Scanner;
//Q2 Program to find greater of two numbers using ternary Operator
public class TernaryMax {
	int findmaxternary(int num1,int num2)
	{
		int max;
		max=(num1>num2)? num1:num2;
		return max;	
	}	
	public static void main(String [] args){
		
		System.out.println("Enter 2 numbers");
		Scanner sr =new Scanner(System.in);
		int num1 = sr.nextInt();
		int num2 = sr.nextInt();		
		sr.close();
		TernaryMax tmax=new TernaryMax();
		if (num1==num2)
			System.out.println("Both numbers are equal");
		else
		System.out.println("Greater number amongst " +num1+" and "+num2+" is "+tmax.findmaxternary(num1,num2));
	}
}

