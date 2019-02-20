/*-------------------------------------------------------------------------------------
Assignment: WAP to reveres user given number
a. Input number:- 456789
b. Output number :- 987654
 ------------------------------------------------------------------------------------*/
/*LOGIC_1:
 * 1. collected the number in string format 
 * 2. reversed by using for starting from end of string and charAt(index) function.
 -----------------------------------------------------------------------------------**/
/*LOGIC_2:
 * NUMBER = 123
1. reverse = reverse * 10;  --->  00, 30, 320, 3210
2. reverse=reverse + number%10; ---> 00 + 3, 30+2, 320+1
3. number = number/10; ---> 12, 1
 -----------------------------------------------------------------------------------**/

package shraddha;

import java.util.Scanner;

public class ReverseGivenNo {

	void reverseNumberLOGIC_1(int number1) {
		String number = "" + number1;
		String reversestring = "";

		for (int index = number.length() - 1; index >= 0; index--) {
			reversestring = reversestring + number.charAt(index);
		}

		System.out.println("Reversed number is:" + reversestring);
	}

	static void reverseNumberLOGIC_2(int number) {
		int mod = 0, reverse = 0;
		while (number > 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number to reverse: ");
		int number = sc.nextInt();
		reverseNumberLOGIC_2(number);
	}

}
