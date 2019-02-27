/*-------------------------------------------------------------------------------
Assignment: 
Perform below requirement using collection.

WAP which fulfill below condition
a. WAP to find positive and negative number from the given array
b. check the sum of individual.
Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
Output :- expected output of
a. positive number = {5, 6, 14, 6, 7}
b. negative number = {-9, -25, -14}
c. positive number sum :- 38
d. negative number sum :- 48 
-------------------------------------------------------------------------------*/

package shraddha;

import java.util.ArrayList;

public class Collections_Assignment_1 {

	void positiveNegative() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> alpositive = new ArrayList<Integer>();
		ArrayList<Integer> alnegative = new ArrayList<Integer>();

		al.add(5);
		al.add(6);
		al.add(-9);
		al.add(14);
		al.add(-25);
		al.add(6);
		al.add(7);
		al.add(-14);

		for (int index = 0; index < al.size(); index++) {
			if (al.get(index) > 0) {
				alpositive.add(al.get(index));
			} else {
				alnegative.add(al.get(index));
			}
		}

		int sumpositive = 0, sumnegative = 0;
		for (int index = 0; index < alpositive.size(); index++) {
			sumpositive = sumpositive + alpositive.get(index);
		}
		for (int index = 0; index < alnegative.size(); index++) {
			sumnegative = sumnegative + alnegative.get(index);
		}

		System.out.println(" positive number = " + alpositive);
		System.out.println("sumpositive:= " + sumpositive);
		System.out.println("negative number = " + alnegative);
		System.out.println("sumnegative:= " + sumnegative);

	}

	public static void main(String[] args) {

		Collections_Assignment_1 c = new Collections_Assignment_1();
		c.positiveNegative();
	}

}
