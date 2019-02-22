package vishal;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionQ12 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		CollectionQ12 q12 = new CollectionQ12();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String input = sc.next();
		al.add(input);
		q12.checkPalindrom(input);

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

			System.out.println("String is Palindrome");

		} else {
			System.out.println("String is not palindrome");
		}
	}

}

