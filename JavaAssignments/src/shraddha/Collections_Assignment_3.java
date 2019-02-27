/*---------------------------------------------------------------------
Perform using collections.
Assignment: WAP to find frequency of user defined character in user defined String
a. i.e. User String :- “electrical engineering”
b. char value :- e
c. count of e :- 5 
 ----------------------------------------------------------------------*/

package shraddha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Collections_Assignment_3 {

	void CharFrequency(String s, char search_char) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		// ---Adding values of string in character arraylist----
		ArrayList<Character> c = new ArrayList<Character>();
		for (int index = 0; index < s.length(); index++) {
			c.add(s.charAt(index));
		}

		// -----Adding frequency of each char in string-----
		for (char charachter : c) {
			if (hm.containsKey(charachter)) {
				hm.put(charachter, hm.get(charachter) + 1);
			} else {
				hm.put(charachter, 1);
			}
		}

		// -----Search char and count in hash map-----
		Set<Character> allcharachters = hm.keySet();
		for (Character c1 : allcharachters) {
			if (c1.equals(search_char)) {
				System.out.println("'" + search_char + "' appears " + hm.get(c1) + " times in " + s);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String s = sc.nextLine();
		System.out.println("Please enter the character to be searched:= ");
		char search_char = sc.next().charAt(0);

		Collections_Assignment_3 c3 = new Collections_Assignment_3();
		c3.CharFrequency(s, search_char);
	}
}
