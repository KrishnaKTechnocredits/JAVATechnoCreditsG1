package vishal;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionQ14 {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();

		CollectionQ14 q4 = new CollectionQ14();

		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(2);
		arr1.add(5);

		arr2.add(5);
		arr2.add(6);
		arr2.add(7);
		arr2.add(8);
		arr2.add(9);
		arr2.add(7);
		q4.findUnique(arr1, arr2);

	}

	public void findUnique(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		HashSet<Integer> hs = new HashSet<Integer>();
		arr1.removeAll(arr2);
		arr1.addAll(arr2);
		hs.addAll(arr1);
		System.out.println(hs);
	}

}