/*-------------------------------------------------------
USE COLLECTIONS
Assignment: WAP to find vowels in given string
a. Input :- automation engineering
b. Count :- 11
-------------------------------------------------------*/

package shraddha;

import java.util.HashMap;
import java.util.Set;

public class Collection_Assignment_8 {

	public static void main(String[] args) {

		String s = "automation engineering";

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int index = 0; index < s.length(); index++) {
			if (hm.containsKey(s.charAt(index))) {
				hm.put(s.charAt(index), hm.get(s.charAt(index)) + 1);
			} else {
				hm.put(s.charAt(index), 1);
			}
		}

		int totalvowel = 0;
		Set<Character> chars = hm.keySet();
		for (char vowel : chars) {
			if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
				totalvowel = totalvowel + hm.get(vowel);
			}
		}
		System.out.println(totalvowel);
	}
}
