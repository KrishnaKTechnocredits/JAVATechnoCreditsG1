package amarja;
import java.util.Scanner;
/*2) WAP to find max length String from the given array.
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
 */
public class ArrayPrg2 {
	public static void main(String args[])
	{
		Scanner sr=new Scanner(System.in);//Step 1:Method to read the integer array
		ArrayPrg2 pr1=new ArrayPrg2();
		String input[] =pr1.input(sr);
		sr.close();
		System.out.println("Maximum Length string is : "+pr1.findmaxlength(input)+" with length = s"+pr1.findmaxlength(input).length());
	}
	String[] input(Scanner sr) {
		System.out.println("Enter size of array");
		int size=Integer.parseInt(sr.nextLine());
		String input[]= new String[size];
		System.out.println("Enter values of array");
		for (int index=0;index<size;index++)
		input[index]=sr.nextLine();
		return input;
		}
	String findmaxlength(String input [])
	{
		int max=0;String maxstring="";
		for (int index=0;index<input.length;index++)
		{	
			if (max<input[index].length())
			{
				max=input[index].length();
				maxstring=input[index];
			}
		}
		return maxstring;
	}

}
