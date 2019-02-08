package vishal;

import java.util.Scanner;

public class Addition {

	public int sum(int val1, int val2) {
		return val1 + val2;
	}

	public double sum(double val1, double val2) {
		return val1 + val2;
	}

	public String sum(String val1, String val2) {
		return val1 + val2;
	}

	public static void main(String[] args) {
		Addition add = new Addition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int value 1 ");
		int val1 = sc.nextInt();
		System.out.println("Enter int val 2");
		int val2 = sc.nextInt();
		System.out.println("Enter decimal value 1");
		double dval1 = sc.nextDouble();
		System.out.println("Enter decimal value 2");
		double dval2 = sc.nextDouble();
		System.out.println("Enter first string");
		String fString = sc.next();
		System.out.println("Enter second string");
		String sString = sc.next();

		int sumInt = add.sum(val1, val2);
		System.out.println("Sum of integer no.s: " + sumInt);

		double sumDouble = add.sum(dval1, dval2);
		System.out.println("Sum of decimal no.s: " + sumDouble);

		String sumString = add.sum(fString, sString);
		System.out.println("Sum of Strings: " + sumString);

	}

}
