package amarja;
//Question 7 Program to find all pair of integer array whose sum is equal to given number
import java.util.Scanner;
public class Sumequaltonum {
	void findpair(int arr[],int no)
	{	boolean flag=false;
		System.out.println("Integer pair number whose sum equal to " +no+":");
		for (int index=0;index<arr.length;index++)
		{	//Using the logic of sum to find pair 2 and then checking if pair 2 is present in array
			int pair2=no-arr[index];
			int pair1=arr[index];
			Arraycontnum a=new Arraycontnum();
			flag=a.findnum(arr,pair2); //Calling method to find if given number is present in array
			if (flag==true)
			System.out.println( pair1+","+pair2);
		}	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);//Reading the size and values of array 1
		System.out.println("Enter size of first array:");
		int size1=sc.nextInt();
		System.out.println("Enter values of first array:");
		int[]arr = new int[size1];
		for (int index=0;index<size1;index++)
		{
			arr[index]=sc.nextInt();
		}
		System.out.println("Enter the sum of given no");
		int no =sc.nextInt();
		sc.close();
		Sumequaltonum num =new Sumequaltonum();
		num.findpair(arr,no);
	}
}
