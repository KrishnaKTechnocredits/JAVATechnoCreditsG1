package rahulV;

import java.util.HashMap;

public class FrequencyOfCharacter {

	static void frqChar(String str) {

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));

			if (hs.containsKey(str.charAt(i))) { // if key is present then increase value by 1 and put into HashMap
				int value = hs.get(str.charAt(i));
				hs.put(str.charAt(i), value + 1);

			} else { // if key is not present then put it map with value 1
				hs.put(str.charAt(i), 1);
			}

		}
		System.out.println(hs);
	}

	public static void main(String[] args) {
		frqChar("electrical");

	}

}
