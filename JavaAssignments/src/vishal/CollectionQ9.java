package vishal;

import java.util.ArrayList;

public class CollectionQ9 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(14);
		al.add(32);
		al.add(19);
		al.add(14);
		al.add(78);
		al.add(36);

		CollectionQ9 q9 = new CollectionQ9();
		q9.findAvg(al);

	}

	public void findAvg(ArrayList<Integer> al) {
		double sum = 0;
		for (int i = 0; i < al.size(); i++) {
			sum = sum + al.get(i);
		}

		double avg = sum / al.size();
		System.out.println("Avg is " + avg);
	}

}
