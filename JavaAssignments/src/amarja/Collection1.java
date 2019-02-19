package amarja;

import java.util.LinkedList;
import java.util.Scanner;

/*1) WAP which fulfill below condition
a. WAP to find positive and negative number from the given array
b. check the sum of individual using collection
Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
Output :- expected output of
a. positive number = {5, 6, 14, 6, 7}
b. negative number = {-9, -25, -14}
c. positive number sum :- 38
d. negative number sum :- 48 */
public class Collection1 {
	public static void main(String[] args) {
		Collection1 c1 = new Collection1();
		Scanner sc = new Scanner(System.in);
		c1.findsum(sc);
		sc.close();
	}

	// Method to accept input from user and calculate positive ,negative no and
	// their sum
	LinkedList<Integer> findsum(Scanner sc) {
		int possum = 0;
		int negsum = 0;
		LinkedList<Integer> a1 = new LinkedList<Integer>();
		LinkedList<Integer> a2 = new LinkedList<Integer>();
		System.out.println("Please enter values of arraylist:");
		System.out.println("Please enter 0000 to END");
		int temp = sc.nextInt();
		do {
			if (temp > 0) {
				a1.add(temp);
				possum = possum + temp;
			} else {
				a2.add(temp);
				negsum = negsum + temp;
			}
			temp = sc.nextInt();
		} while (temp != 0000);
		System.out.println("Positive number are :- ");
		System.out.println(a1);
		System.out.println("Positive number sum is:- " + possum);
		System.out.println("Negative number are:-");
		System.out.println(a2);
		System.out.println("Negative number sum is:- " + negsum);
		a1.addAll(a2);
		System.out.println(a1);
		return a1;
	}
}
