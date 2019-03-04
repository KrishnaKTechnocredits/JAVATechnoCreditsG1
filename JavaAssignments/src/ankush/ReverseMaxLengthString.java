package ankush;

public class ReverseMaxLengthString {
	/*
	 * Method to take input array and calculate max string from that array
	 * elements
	 */
	String findMaxLenString(String input[]) {
		String maxString = "";
		int temp = input[0].length();
		for (int index = 1; index < input.length; index++) {
			if (temp < input[index].length()) {
				temp = input[index].length();
				maxString = input[index];
			}

		}
		return maxString;
	}

	/* Method to Reverse String */
	String reverseString(String strInput) {
		String temp = "";
		for (int index = strInput.length() - 1; index >= 0; index--) {
			temp = temp + strInput.charAt(index);
		}
		return temp;
	}

	public static void main(String[] args) {
		String input[] = { "all the best", "technocredits", "", "maharashtra" };
		ReverseMaxLengthString findMaxLen = new ReverseMaxLengthString();
		String maxString = findMaxLen.findMaxLenString(input);
		String revString = findMaxLen.reverseString(maxString);
		System.out.println("Output Max length string :- " + maxString);
		System.out.println("Max length string reverse value :- " + revString);
	}
}
