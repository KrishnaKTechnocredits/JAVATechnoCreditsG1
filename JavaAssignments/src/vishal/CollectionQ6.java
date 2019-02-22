package vishal;

import java.util.ArrayList;

public class CollectionQ6 {

	public static void main(String[] args) {
		CollectionQ6 q6 = new CollectionQ6();

		ArrayList<String> al = new ArrayList<String>();
		al.add("all the best");
		al.add("technocredits");
		al.add("");
		al.add("maharashtra");

		String maxString = q6.findMax(al);
		System.out.println("Max string is: " + maxString);
		
		q6.findReverse(maxString);

		

	}

	public String findMax(ArrayList<String> al) {
		int max = 0;
		String maxLengthString = "";
		for (String s : al) {
			if (max < s.length()) {
				maxLengthString = s;
				max = s.length();
			}

		}
		return maxLengthString;

	}

	public void findReverse(String s) {
		ArrayList<Character> al = new ArrayList<Character>();
		for (int i = s.length() - 1; i >= 0; i--) {
			al.add(s.charAt(i));
		}
		System.out.println("Reverse String is: ");
		for (int j = 0; j < al.size(); j++) {

			System.out.print(al.get(j));
		}
	}
}