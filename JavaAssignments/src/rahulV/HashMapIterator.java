package rahulV;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIterator {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Rahul");
		hm.put(2, "Rohit");
		hm.put(3, "Maulik");

		System.out.println(hm);

		Set<Integer> s = hm.keySet();

		/*
		 * for (Integer key :s) {                            //enhanced for loop
		 * System.out.println(key+": "+hm.get(key)); }
		 */

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			Integer key = (Integer) itr.next();
			System.out.println(key + " : " + hm.get(key));
		}

	}

}
