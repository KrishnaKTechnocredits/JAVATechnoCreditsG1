package saket;

public class Maxnrev {

	public static void main(String[] args) {

		String Input[] = { "all the best", "technocredits", "", "maharashtra" };

		String maxarr = maxarray(Input);
		String reverseofmax = " ";
		for (int i = maxarr.length() - 1; i >= 0; i--) {

			reverseofmax = reverseofmax + maxarr.charAt(i);

		}

		System.out.println("reverse of max is" + reverseofmax);

	}

	static String maxarray(String[] Input) {

		int max = 0;
		int index = 0;
		String maxarray = " ";

		for (int i = 0; i < Input.length - 1; i++)

			if (Input[i].length() > max) {

				max = Input[i].length();
				maxarray = Input[index];
				index++;

			}

		return maxarray;

	}

}
