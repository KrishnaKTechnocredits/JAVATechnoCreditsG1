package saket;

import java.util.Scanner;

public class Dublicatenumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Element");

		int size = sc.nextInt();

		int[] a = new int[size];

		System.out.println("Enter the input for Dublicate number");

		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}

		for (int index1 = 0; index1 < a.length; index1++)

		{

			for (int index2 = index1 + 1; index2 < a.length; index2++) {
				if (a[index1] == a[index2])
					System.out.println(" Dublicate number  is " + a[index1]);

			}

		}
	}
}
