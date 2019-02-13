/*-------------------------------------------------------------------------------------
Assignment: WAP to reveres user given number
a. Input number:- 456789
b. Output number :- 987654
 ------------------------------------------------------------------------------------*/
/*LOGIC:
 * 1. collected the number in string format 
 * 2. reversed by using for starting from end of string and charAt(index) function.
 -----------------------------------------------------------------------------------**/

package shraddha;

import java.util.Scanner;

public class ReverseGivenNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number to reverse: ");
		String number = sc.next();
		String reversestring = "";

		for (int index = number.length() - 1; index >= 0; index--) {
			reversestring = reversestring + number.charAt(index);
		}

		System.out.println("Reversed number is:" + reversestring);
	}

}
