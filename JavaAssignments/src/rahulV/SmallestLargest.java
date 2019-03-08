package rahulV;

import java.util.ArrayList;
import java.util.Collections;

public class SmallestLargest {

	void findNumber() {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(10);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(9);

		Collections.sort(al);

		System.out.println(al); // sorted array

		System.out.println("largest number is " + al.get(al.size() - 1));
		System.out.println("Second largest number is " + al.get(al.size() - 2));
		System.out.println("Smallest number is " + al.get(0));
	}

	public static void main(String[] args) {

		SmallestLargest n = new SmallestLargest();
		n.findNumber();

	}

}
