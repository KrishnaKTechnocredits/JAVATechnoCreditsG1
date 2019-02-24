package vishal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionQ11 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		CollectionQ11 q11 = new CollectionQ11();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = sc.nextInt();
		al.add(num);
		String input = al.get(0).toString();
		q11.checkPalindrom(input);

	}

	public void checkPalindrom(String s) {
		ArrayList<Character> al1 = new ArrayList<Character>();
		ArrayList<Character> al2 = new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {
			al1.add(s.charAt(i));

		}

		for (int i = s.length() - 1; i >= 0; i--) {
			al2.add(s.charAt(i));
		}

		if (al1.equals(al2)) {

			System.out.println("Num is Palindrome");

		} else {
			System.out.println("Num is not palindrome");
		}
	}

}
