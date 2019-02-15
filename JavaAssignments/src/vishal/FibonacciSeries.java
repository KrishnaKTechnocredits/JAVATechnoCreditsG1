package vishal;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		FibonacciSeries fs=new FibonacciSeries();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		System.out.println("Fibonnaci Series of given number is: "+fs.result(num));
	}

	public int result(int num)
	{
		int[] arr=new int[num];
		int result=1;
		
		for(int index=0;index<num;index++ )
		{
			arr[index]=num-index;
			result=result*arr[index];
		}
		return result;

	}
}
