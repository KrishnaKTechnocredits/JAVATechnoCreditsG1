package ankush;


public class MaxLengthString {

	/* Method to take input array and calculate max string from that array elements */
	void findMaxLenString(String input[]) {
		String maxString="";
		int temp = input[0].length();
		for (int index = 1; index < input.length; index++) {
			if (temp < input[index].length()) {
				temp = input[index].length();
				 maxString=input[index];
			}

		}
		System.out.println(maxString);
	}

	public static void main(String[] args) {
		String input[] = { "all the best", "technocredits", "", "maharashtra" };
		MaxLengthString findMaxLen = new MaxLengthString();
		findMaxLen.findMaxLenString(input);
	}
}
