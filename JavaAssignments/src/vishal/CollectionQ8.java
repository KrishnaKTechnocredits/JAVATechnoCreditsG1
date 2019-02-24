package vishal;

import java.util.ArrayList;

public class CollectionQ8 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("automation engineering");
		String text = al.get(0);
		CollectionQ8 q8 = new CollectionQ8();
		q8.findVowels(text);

	}

	public void findVowels(String s) {
		int count = 0;
		for (int i = 0; i <s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count = count + 1;
			}
		}
		System.out.println("Total vowels are: "+count);
	}

}
