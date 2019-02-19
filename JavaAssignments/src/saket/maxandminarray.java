package saket;

import java.util.Scanner;

public class maxandminarray {

	public static void main(String[] args) {
		maxandminarray ar = new maxandminarray();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Element");

		int size = sc.nextInt();

		int[] a = new int[size];

		System.out.println("Enter the input for  array number");

		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();
		}

		ar.maximum(a);
		ar.minimum(a);

	}

	void maximum(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Largest number in array is " + max);
	}

	void minimum(int[] a) {
		int min = a[0];
		for (int j = 1; j < a.length; j++) {

			if (a[j] < min) {
				min = a[j];
			}

		}
		System.out.println("smallest number in array is " + min);

	}

}
