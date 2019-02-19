package saket;

public class Reverse {

	public static void main(String[] args) {

		int input = 456789;

		String input1 = Integer.toString(456789);
		String reverse = "";

		for (int i = input1.length() - 1; i >= 0; i--) {
			reverse = reverse + input1.charAt(i);
		}
		System.out.println("reverse OF THE GIVEN NUMBER IS " + reverse);
	}

}
