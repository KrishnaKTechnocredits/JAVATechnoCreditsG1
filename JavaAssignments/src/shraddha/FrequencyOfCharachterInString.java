/*----------------------------------------------------------------------------------
 Assignment: WAP to find frequency of user defined character in user defined String
a. i.e. User String :- “electrical engineering”
b. char value :- e
c. count of e :- 5
 *----------------------------------------------------------------------------------*/

package shraddha;

import java.util.Scanner;

public class FrequencyOfCharachterInString {

	void frequencyOfCharachterInString(String s1, String searchchar) {
		
		int stringlength = s1.length();
		if(s1.indexOf(searchchar)==-1)
		{
			System.out.println("Oopssss... Charachter does not exists in the given string!!!!");
		}
		else
		{
			s1 = s1.replaceAll(searchchar, "");
			stringlength = stringlength-s1.length();
			System.out.println("count of "+searchchar+":- "+stringlength);
		}

	}

	public static void main(String[] args) {

		// Accepting String and charchter to be searched from user.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a string:");
		String s1 = sc.nextLine();
		System.out.println("Enter charachter to be searched in above string: ");
		String searchchar = sc.next();

		new FrequencyOfCharachterInString().frequencyOfCharachterInString(s1, searchchar);

	}

}
