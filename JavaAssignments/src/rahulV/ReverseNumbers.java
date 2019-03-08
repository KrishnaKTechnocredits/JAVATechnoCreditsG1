package rahulV;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseNumbers {

	public static void main(String[] args) {

		LinkedList<Integer> al = new LinkedList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Iterator itr = al.descendingIterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		/*
		 * Collections.reverse(al); 
		 * System.out.println(al);
		 */

	}

}
