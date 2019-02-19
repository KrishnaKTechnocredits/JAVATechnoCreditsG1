package amarja;
import java.util.Scanner;
/*WAP which fulfill below condition
a. WAP to find positive and negative number from the given array
b. check the sum of individual.
Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
Output :- expected output of
a. positive number = {5, 6, 14, 6, 7}
b. negative number = {-9, -25, -14}
c. positive number sum :- 38
d. negative number sum :- 48*/ 
public class ArrayPrg1 {
	public static void main(String args [])
	{
	 int i=0;int j=0;
		Scanner sr=new Scanner(System.in);//Step 1:Method to read the integer array
		ArrayPrg1 pr1=new ArrayPrg1();
		int input[] =pr1.input(sr);
		sr.close();
		int posinput[]=pr1.findposno(input,i);//Step 2 :Method to find and print the positive number
		int neginput[]=pr1.negposno(input,j);//Step 3 :Method to find and print the negative number
		System.out.println("Positive sum = "+pr1.findsum(posinput));
		System.out.println("Negative sum= "+pr1.findsum(neginput));		
	}
	int [] input(Scanner sr) { //Reading the input
		System.out.println("Enter size of array");
		int size=sr.nextInt();
		System.out.println("Enter values of array");
		int input[]= new int[size];
		for (int index=0;index<size;index++)
		input[index]=sr.nextInt();
		return input;
		}
	int findsum(int input[])//method to find sum
	{
		int sum=0;
		for (int index=0;index<input.length;index++)
		{
			sum=sum+input[index];
		}
		return sum;		
	}
	int[]findposno(int input[],int i)//Method to find and print the positive * number is said format
	{
		int[] posinput = new int[10];
		for (int index=0;index<input.length;index++)
		{			
			if (input[index]>=0)
			{
			posinput[i]=input[index];
			i++;
			}
		}
		System.out.print("Positive number = { ");
		for (int index=0;index<i;index++)
			System.out.print(posinput[index]+",");
			System.out.println("}");
			return posinput;
	}
		int[] negposno(int input[],int j)//Method to find and print the positive * number is said format
		{
			int[] neginput = new int[10];
			for (int index=0;index<input.length;index++)
			{
				if (input[index]<0)
				{
				neginput[j]=input[index];
				j++;
				}
			}
			System.out.print("Negative number = { ");
			for (int index=0;index<j;index++)
				System.out.print(neginput[index]+",");
				System.out.println("}");
			return neginput;	
		}
}
		
	