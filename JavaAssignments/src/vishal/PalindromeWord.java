package vishal;

import java.util.Scanner;

public class PalindromeWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word ");
		String input = sc.next();
		PalindromeWord pw = new PalindromeWord();
		boolean status = pw.checkPalindrome(input);

		if (status == true) {
			System.out.println("Word is Palindrome");

		} else {
			System.out.println("Word is not Palindrome");

		}

	}

	boolean checkPalindrome(String word) {
		String reverse = "";
		boolean status = true;
		for (int index = word.length() - 1; index >= 0; index--) {
			reverse = reverse + word.charAt(index);
		}
		if (word.equals(reverse)) {
			status = true;
		} else {
			status = false;
		}
		System.out.println(reverse);
		return status;
	}
}
