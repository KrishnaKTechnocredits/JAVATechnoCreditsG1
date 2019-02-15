package vishal;

public class ReverseMaxLengthQ6 {

	public static void main(String[] args) {
		ReverseMaxLengthQ6 rml = new ReverseMaxLengthQ6();
		String MaxLenString = rml.maxLengthString();
		System.out.println("Max Length string is " + MaxLenString);
		String reverseString = rml.reverseMaxLength(MaxLenString);
		System.out.println("Reverse String is " + reverseString);

	}

	public String maxLengthString() {
		int max = 0;
		int maxIndex = 0;
		String[] InputArray = { "all the best", "technocredits", "", "maharashtra" };

		for (int index = 0; index < InputArray.length; index++) {
			if (InputArray[index].length() > max) {
				max = InputArray[index].length();
				maxIndex = index;

			}
		}
		String maxString = InputArray[maxIndex];
		return maxString;

	}

	public String reverseMaxLength(String s) {
		String result = "";
		for (int index = s.length() - 1; index >= 0; index--) {
			result = result + s.charAt(index);

		}
		return result;
	}

}
