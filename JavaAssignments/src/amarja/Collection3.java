package amarja;

import java.util.HashMap;
import java.util.Scanner;

/* WAP to find frequency of user defined character in user defined String
a. i.e. User String :- “electrical engineering”
b. char value :- e
c. count of e :- 5* 
 */
public class Collection3 {
	public static void main(String[] args) {
		Collection3 c3 = new Collection3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String temp = sc.nextLine();
		System.out.println("Enter Character");
		char ch = sc.nextLine().charAt(0);
		sc.close();
		c3.findcharcount(temp, ch);
	}

	void findcharcount(String temp, char ch) {
		HashMap<Character, Integer> h2 = new HashMap<Character, Integer>();
		int count = 0;
		for (int index = 0; index < temp.length(); index++) {
			if (ch == (temp.charAt(index)))
				count++;
			h2.put(ch, count);
		}
		System.out.println("Count value of char" + h2);
	}
}
