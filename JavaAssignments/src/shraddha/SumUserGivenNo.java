/*-----------------------------------------------------------------------------------------
Assignment: WAP to find sum of user given number.
a. Input:- 159753
b. Sum of given number:- 30
/*-----------------------------------------------------------------------------------------
LOGIC
1. lastdigit = number%10;
	sum = sum + lastdigit;
	number = number/10;
 /*---------------------------------------------------------------------------------------*/

package shraddha;

import java.util.Scanner;

public class SumUserGivenNo {

	public static void main(String[] args) {
		System.out.print("Please enter any number whose sum you wanna find:");
		Scanner sc = new Scanner(System.in);

		// WHY we cannot use below logic??---- ASCII
		/*
		 * String number = sc.next(); int result = 0; for(int index =
		 * 0;index<number.length();index++) {
		 * System.out.print("result"+result+"+"+number.charAt(index)+"= ");
		 * result = (int)(result + number.charAt(index)); }
		 * System.out.println(result);
		 */
		
		int number = sc.nextInt();
		int lastdigit = 0, sum=0;
		
		while(number>0)
		{
			lastdigit = number%10;
			sum = sum + lastdigit;
			number = number/10;
		}
		System.out.println("Sum of given number is: "+sum);
	}

}
