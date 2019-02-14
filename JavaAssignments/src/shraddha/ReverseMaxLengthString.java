/*------------------------------------------------------------------------------
 Assignment: WAP to find reverse max length string
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
b. Output Max length string :- Technocredits
c. Max length string reverse value :- stiderconhcet
 ------------------------------------------------------------------------------*/
/*LOGIC
 1. Function: acceptString() - accepts all user defined strings in array and returns array of all strings.
  ***------------***-------------------***---------------
 2. Function: StringLength() - Counts length of all the strings in the array and returns max length string.
 i) max length as length of string at first location of array.
 ii) max < string[index].length() then, max = string[index].length()
 iii) return max length string.
 ***------------***-------------------***---------------
 3. Function: reverseString() - accepts max length string and return reverse string.
 i) starts index from end of string length -1 and goes till 0
 ii) charAt() returns character at index
 iii) fetch each charachter and append it in the end.
  ------------------------------------------------------------------------------**/

package shraddha;

import java.util.Scanner;

public class ReverseMaxLengthString {

	String[] acceptString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter total number of strings to be entered: ");
		int string_count = sc.nextInt();

		System.out.println("Please enter string: ");
		String user_string[] = new String[string_count];
		for (int index = 0; index <= user_string.length - 1; index++) {
			user_string[index] = sc.next();
		}
		return user_string;
	}

	String StringLength(String[] user_string) {
		int string_length_max = user_string[0].length();
		String max_String = "";
		for (int index = 0; index <= user_string.length - 1; index++) {
			if (user_string[index].length() >= string_length_max) {
				string_length_max = user_string[index].length();
				max_String = user_string[index];
			}
		}
		return max_String;
	}

	String reverseString(String string) {
		String reverse_String = "";
		for (int index = string.length() - 1; index >= 0; index--) {
			reverse_String = reverse_String + string.charAt(index);
		}
		return reverse_String;
	}

	public static void main(String[] args) {

		ReverseMaxLengthString r = new ReverseMaxLengthString();
		String s = r.StringLength(r.acceptString());
		System.out.println("Max length string:- " + s);
		System.out.println("Max length string reverse value :- " + r.reverseString(s));
	}

}
