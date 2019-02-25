package amarja;
/***12)WAP to find word is palindrome or not ?
a. String name = “naman”
i. Naman is palindrome
b. String name = “harsh”
i. Harsh is not palindrome
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Collection12 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		Collection6 c6 = new Collection6();
		Collection2 c2 = new Collection2();
		Scanner sc = new Scanner(System.in);
		l1 = c2.userinput(sc);
		sc.close();
		for (int index = 0; index < l1.size(); index++) {
			String string = c6.reversestring(l1.get(index));
			if (l1.get(index).equals(string))
				System.out.println("String " + l1.get(index) + " is palindrome.");
			else
				System.out.println("String " + l1.get(index) + " is not a palindrome.");
		}
	}

}
