//-------------------------------------------------------------------------------
// Assignment: Find the largest of three numbers using Logical And operator.
//-------------------------------------------------------------------------------
package shraddha;

import java.util.Scanner;

public class LargestofThreeNos {
	
	void largestofThreeNos(int first_number, int second_number,int third_number )
	{
		if (first_number > second_number && first_number > third_number)
		{
			System.out.println("First Number is greatest");
		} 
		else if (second_number > first_number && second_number > third_number)
		{
			System.out.println("Second Number is greatest");
		}
		else
		{
			System.out.println("Third Number is greatest");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number, Second Number and Third Number:- ");
		int first_number = sc.nextInt();
		int second_number = sc.nextInt();
		int third_number = sc.nextInt();

		LargestofThreeNos l = new LargestofThreeNos();
		l.largestofThreeNos(first_number, second_number, third_number);
		
		

	}

}
