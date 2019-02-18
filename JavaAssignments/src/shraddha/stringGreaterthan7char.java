/*------------------------------------------------------------------------------
Assignmnet: WAP to find string which has length more than 7 characheter.
a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”,
”abhishek”}\
b. Output :- Krishna, aakansha, abhishek
 ------------------------------------------------------------------------------*/

package shraddha;

import java.util.Scanner;

public class stringGreaterthan7char {

	static Scanner sc = new Scanner(System.in);

	String[] acceptStrings(String[] str) {
		for (int index = 0; index < str.length; index++) {
			str[index] = sc.next();
		}
		return str;
	}

	void stringGreaterthan(String[] str) {
		String s = "";
		for (int index = 0; index < str.length; index++) {
			if (str[index].length() > 7)
			{
				s = s+str[index]+",";
			}
		}
		s = s.substring(0, s.length()-1);
		System.out.println(s);
	}

	public static void main(String[] args) {
		System.out.println("Please tell how many strings you wanna enter: ");
		int size = sc.nextInt();
		System.out.println("Please enter the strings");
		String[] str = new String[size];
		stringGreaterthan7char s = new stringGreaterthan7char();
		s.stringGreaterthan(s.acceptStrings(str));
	}
}
