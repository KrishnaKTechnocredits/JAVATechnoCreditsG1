package saket;

import java.util.Scanner;

public class secondhighest {

	public static void main(String[] args) {
		secondhighest ar = new secondhighest();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Element");

		int size = sc.nextInt();

		int[] a = new int[size];

		System.out.println("Enter the input for  array number");

		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();
		}

		ar.secondhigh(a);

	}

	void secondhigh(int[] a) {
		int max = a[0];
		int secondmax = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}

		}

		for (int j = 1; j < a.length; j++) {
			if (a[j] > secondmax && a[j] < max) {
				secondmax = a[j];
			}
		}
		System.out.println(secondmax);
	}

}
