package ankush;

public class PalindromeNumber {

	void checkPalindrome(int input) {
		int inputVal = input;
		String sum = "";

		while (input % 10 != 0) {
			sum = sum + "" + (input % 10);
			input = (input / 10);
		}

		if (Integer.parseInt(sum) == inputVal) {
			System.out.println("Input value is Palindrome");
		} else {
			System.out.println("Input value is not Palindrome");
		}

	}

	public static void main(String[] args) {
		int input = 12321;
		PalindromeNumber palindromeNumb = new PalindromeNumber();
		palindromeNumb.checkPalindrome(input);
	}
}
