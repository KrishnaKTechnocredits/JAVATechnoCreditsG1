package saket;

public class Palandrome {

	public static void main(String[] args) {

		int num = 12321;

		String num1 = "12321";
		String reverse = "";
		for (int i = num1.length() - 1; i >= 0; i--) {

			reverse = reverse + num1.charAt(i);

		}

		int output = Integer.parseInt(reverse);
		if (output == num) {
			System.out.println("Given num is a palandrome");
		} else {

			System.out.println("Given num is not a palandrome");

		}
	}
}