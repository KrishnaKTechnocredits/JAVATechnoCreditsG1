package amarja2;
import java.util.*;
//Question 3 Program to find array contains number 
public class Arraycontnum {
	boolean findnum(int arr[],int num)
	{	boolean flag=false;
		for (int index=0;index<arr.length;index++)
		{
			if (arr[index]==num)
				flag=true;
		}
		return flag;
	}
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		System.out.println("Enter values of array");
		int[]arr = new int[size];
		for (int index=0;index<size;index++)
		{
			arr[index]=sc.nextInt();
		}
		System.out.println("Enter number to be searched in array");
		int no =sc.nextInt();
		sc.close();
			Arraycontnum find =new Arraycontnum();
		if ((find.findnum(arr,no)== true))
			System.out.println("Number "+ no+" is present in array");
		else
			System.out.println("Number "+ no+" is not present in array.");
	}
}
