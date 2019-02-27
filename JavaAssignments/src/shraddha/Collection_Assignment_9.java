/*-----------------------------------------------------
USE COLLECTIONS
WAP to find average of user given array
a. Input :- {14, 32, 19, 14, 78,36}
b. Output:- 32.16
-------------------------------------------------------*/

package shraddha;

import java.util.ArrayList;

public class Collection_Assignment_9 {

	public static void main(String[] args) {

		System.out.println("Please enter the numbers to find average orelse press to q the input ");
		ArrayList<Integer> al = new ArrayList<>();

		al.add(14);
		al.add(32);
		al.add(19);
		al.add(14);
		al.add(78);
		al.add(36);
		double sum = 0, avg = 0;
		for (double num : al) {
			sum = sum + num;
		}
		avg = sum / al.size();
		System.out.println(avg);
	}
}
