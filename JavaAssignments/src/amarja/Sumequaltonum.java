package amarja;
//Question 7 Program to find all pair of integer array whose sum is equal to given number
import java.util.Scanner;
public class Sumequaltonum {
	void findpair(int arr[],int no)
	{	boolean flag=false;
		System.out.println("Integer pair number whose sum equal to " +no+":");
		for (int index=0;index<(arr.length-1);index++)
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
		Sumequaltonum num =new Sumequaltonum();
		int[] arr =num.inputarray();
		num.findpair(arr,arr[arr.length-1]);
	}
	
	int [ ] inputarray()//Created seperate function as per review comments
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		System.out.println("Enter values of array");
		int[]arr = new int[size+1];
		for (int index=0;index<size;index++)
		{
			arr[index]=sc.nextInt();
		}
		System.out.println("Enter sum of given number");
		arr[size] =sc.nextInt();
		sc.close();
		return arr;	
	}

}
