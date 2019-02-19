package saket;

public class Palindrome {

	public static void main(String[] args) {

		String input1 = "naman";
		String input2 = "harsh";

		String output1 = Palindrome(input1);
		String output2 = Palindrome(input2);

	}

	static String Palindrome(String input) {
		String reverse = "";
		for (int i = input.length() - 1; i >= 0; i--) {

			reverse = reverse + input.charAt(i);

		}

		if (input.equals(reverse)) {
			System.out.println("Given num is a palandrome");
		} else {

			System.out.println("Given num is not a palandrome");

		}
		return reverse;
	}

}
