package rahulV;

import java.util.ArrayList;
import java.util.Iterator;

//find average of given arraylist

public class AverageOfArray {

	void findAverage() {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(60);
		al.add(90);

		int average = 0;
		int sum = 0;
		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			sum = sum + itr.next();
		}

		System.out.println("average of elements in the list is " + sum / al.size());
	}

	public static void main(String[] args) {
		AverageOfArray avg = new AverageOfArray();
		avg.findAverage();

	}

}
