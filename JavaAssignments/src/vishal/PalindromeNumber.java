package vishal;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		PalindromeNumber pn = new PalindromeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int input = sc.nextInt();
		boolean status = pn.checkPalindrome(input);
		if (status == true) {
			System.out.println("No is Palindrome");
		} else {
			System.out.println("No is not Palindrome");
		}

	}

	public boolean checkPalindrome(int num) {
		String s = String.valueOf(num);
		String reverse = "";
		boolean status = true;

		for (int index = s.length() - 1; index >= 0; index--) {
			reverse = reverse + s.charAt(index);
			// reverse=reverse+s.valueOf(index) valueOf() method converts
			// different types of values into string

		}

		System.out.println("reverse " + reverse);
		System.out.println(s);

		if (s.equals(reverse)) {
			status = true;
		} else {
			status = false;
		}

		return status;
	}

}
