package amarja;//PENDING
import java.util.Scanner;
/****
)WAP to sum of two array
a. firstArray :- {1, 5, 9, 3, 7}
b. secondAraay:- {1, 7, 9, 3}
c. output :- 45
 */
public class ArrayPrg10 {
	public static void main(String args[])
	{
		Scanner sr=new Scanner(System.in);//Step 1:Method to read the integer array
		ArrayPrg1 pr1=new ArrayPrg1();
		int input1[] =pr1.input(sr);//Method to read first integer array
		System.out.println("Details of Second Array");
		int input2[] =pr1.input(sr);//Method to read first integer array
		sr.close();
		int sum=pr1.findsum(input1)+pr1.findsum(input2);
		System.out.println("Sum of two arrays = "+sum);
	}	
	
}
