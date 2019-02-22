package vishal;

import java.util.ArrayList;

public class CollectionQ10 {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		int sum = 0;

		al1.add(1);
		al1.add(5);
		al1.add(9);
		al1.add(3);
		al1.add(7);

		al2.add(1);
		al2.add(7);
		al2.add(9);
		al2.add(3);

		al1.addAll(al2);

		for (int i = 0; i < al1.size(); i++) {
			sum = sum + al1.get(i);
		}
		System.out.println("Sum is: " + sum);

	}

}
