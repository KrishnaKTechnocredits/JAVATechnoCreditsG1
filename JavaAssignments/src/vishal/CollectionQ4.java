package vishal;

import java.util.ArrayList;

public class CollectionQ4 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(157953);
		CollectionQ4 q4 = new CollectionQ4();
		q4.sum(al);

	}

	void sum(ArrayList<Integer> al) {
		String s = al.get(0).toString();
		int sum = 0;
		for (int index = s.length() - 1; index >= 0; index--) {
			int i = Character.getNumericValue(s.charAt(index));
			sum = sum + i;

		}
		System.out.println(sum);
	}

}
