package amarja;
import java.util.*;
//Question 3 Program to find array contains number 
public class Arraycontnum {
		boolean findnum(int arr[],int num)
		{	boolean flag=false;					
			for (int index=0;index<(arr.length-1);index++)
			{
				if (arr[index]==num)
					{flag=true;
				break;}//Added break statement as per review comments
			}
			return flag;
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
			System.out.println("Enter number to be searched in array");
			arr[size] =sc.nextInt();
			sc.close();
			return arr;	
		}
		public static void main (String args[])
		{			
			Arraycontnum find =new Arraycontnum();
			int arr[]=find.inputarray();//Calling function to accept input
			if ((find.findnum(arr,arr[arr.length-1])== true))
				System.out.println("Number "+ arr[arr.length-1]+" is present in array");
			else
				System.out.println("Number "+ arr[arr.length-1]+" is not present in array.");
		}			
}

