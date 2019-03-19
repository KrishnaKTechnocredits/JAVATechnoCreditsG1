package rahulV;

import java.util.HashMap;
//find frequency of word in given word

public class FrequencyOfWord {
	
	static void FrqWord(String str) {

		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		String[] st = str.split(" ");

		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);

			if (hs.containsKey(st[i])) {
				int value = hs.get(st[i]);
				hs.put(st[i], value + 1);
			} else {
				hs.put(st[i], 1);
			}
		}
		System.out.println(hs);
	}

	public static void main(String[] args) {

		String input = "hi rahul this is rahul";
		FrqWord(input);

	}

}
