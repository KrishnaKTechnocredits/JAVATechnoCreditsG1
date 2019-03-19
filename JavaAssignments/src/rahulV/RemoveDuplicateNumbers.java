package rahulV;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateNumbers {
	void removeDuplicate() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(30);
		al.add(40);

		System.out.println("list with duplicates: " + al);

		HashSet<Integer> hs = new HashSet<Integer>(al);

		System.out.println("list without duplicates: " + hs);
	}

	public static void main(String[] args) {
		RemoveDuplicateNumbers rn = new RemoveDuplicateNumbers();
		rn.removeDuplicate();
	}

}
