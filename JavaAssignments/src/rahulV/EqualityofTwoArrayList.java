package rahulV;

import java.util.ArrayList;

public class EqualityofTwoArrayList {

	void checkEquality() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(10);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(9);

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(10);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(6);
		al1.add(9);

		System.out.println(al);
		System.out.println(al1);

		if (al.equals(al1)) {
			System.out.println("Two arraylist are equal");
		} else {
			System.out.println("Two arraylist are NOT equal");
		}

	}

	public static void main(String[] args) {
		EqualityofTwoArrayList eq = new EqualityofTwoArrayList();
		eq.checkEquality();
	}

}
