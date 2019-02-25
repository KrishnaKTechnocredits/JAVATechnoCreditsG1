package amarja;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 10)WAP to sum of two array a. firstArray :- {1, 5, 9, 3, 7} b. secondAraay:-
 * {1, 7, 9, 3} c. output :- 45
 */
public class Collection10 {

	public static void main(String[] args) {
		Collection10 c10 = new Collection10();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		Collection9 c9 = new Collection9();
		Scanner sc = new Scanner(System.in);
		a1 = c9.userinput(sc);
		a2 = c9.userinput(sc);
		System.out.println("Input Array 1: " + a1);
		System.out.println("Input Array 2: " + a2);
		System.out.println("Sum of two arrays: " + c10.findsum(a1, a2));
	}

	int findsum(ArrayList<Integer> a1, ArrayList<Integer> a2) {
		int sum = 0;
		a1.addAll(a2);
		for (int index = 0; index < a1.size(); index++)
			sum = sum + a1.get(index);
		return sum;

	}

}
