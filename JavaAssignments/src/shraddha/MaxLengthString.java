/*----------------------------------------------------------------------------------
 Assignment: WAP to find max length String from the given array.
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
 ------------------------------------------------------------------------------------*/
/*LOGIC:
 * 1. Take first string length as max
 * 2. Compare next string lengths with the max if greater than max then put it in max. Store max string in one string var
 * 3. Print max length string and max. 
* ------------------------------------------------------------------------------------*/

package shraddha;

import java.util.Scanner;

public class MaxLengthString {

	// Function to find max length string
	void findMaxLengthString(String[] strings) {
		int max = strings[0].length();
		String maxString = "";
		for (int index = 0; index < strings.length; index++) {
			if (strings[index].length() > max) {
				max = strings[index].length();
				maxString = strings[index];
			}
		}
		System.out.println(maxString + " Is Max length string and its length is: " + max);
	}

	// Function: Accept strings from user.
	String[] AcceptStrings() {
		System.out.print("Please Enter the total number of strings you want to enter: ");
		Scanner sc = new Scanner(System.in);
		int arraysize = sc.nextInt();
		String[] strings = new String[arraysize];
		System.out.print("Please enter " + arraysize + " Strings:");
		for (int index = 0; index < strings.length; index++) {
			strings[index] = sc.nextLine();
		}

		return strings;
	}

	public static void main(String[] args) {
		MaxLengthString m = new MaxLengthString();
		m.findMaxLengthString(m.AcceptStrings());

	}

}
