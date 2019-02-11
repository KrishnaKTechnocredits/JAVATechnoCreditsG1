package rahulV;

import java.util.Scanner;

//12) WAP to find word is palindrome or not ?

public class Assignment4_Q12 {

	void findPalidromeWord(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (reverse.equals(str)) {
			System.out.println(str + " is Palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word:");
		String str = scanner.next();
		Assignment4_Q12 pword = new Assignment4_Q12();
		pword.findPalidromeWord(str);

	}

}
