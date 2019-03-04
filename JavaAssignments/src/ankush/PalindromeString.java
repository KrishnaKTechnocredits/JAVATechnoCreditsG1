package ankush;

import java.util.Scanner;

public class PalindromeString {

	void checkPalindrome(String input) {
		String splitInput[] = input.split(" ");
		// String localArray[]=new String[input.length()];
		// String temp=splitInput[0];
		String reverseString = "";

		for (int index = 0; index < splitInput.length; index++) {
			reverseString = stringReverse(splitInput[index]);
			if (splitInput[index].equals(reverseString))

				System.out.println(splitInput[index] + " is Palindrome");

			else
				System.out.println(splitInput[index] + " is not Palindrome");

		}

	}

	String stringReverse(String name) {
		String reverString = "";
		for (int i = name.length() - 1; i >= 0; i--) {

			reverString = reverString + name.charAt(i);
		}
		return reverString;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to Check Palindrome ");
		String input=sc.next();
		PalindromeString palinString = new PalindromeString();
		palinString.checkPalindrome(input);
		sc.close();
	}
}
