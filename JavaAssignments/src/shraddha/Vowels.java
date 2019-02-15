/*-----------------------------------------------------------------------------
 Assignment: WAP to find vowels in given string
a. Input :- automation engineering
b. Count :- 11
 -----------------------------------------------------------------------------*/

package shraddha;

import java.util.Scanner;

public class Vowels {

	static void vowels(String userstring) {
		int count = 0;

		for (int index = 0; index < userstring.length(); index++) {
			switch (userstring.charAt(index)) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;
			}

		}
		System.out.println("Total Vowels" + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter string: ");
		String userstring = sc.nextLine();
		vowels(userstring);
	}

}
