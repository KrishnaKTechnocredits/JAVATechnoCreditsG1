package saket;

public class Maxlength {

	public static void main(String[] args) {

		String Input[] = { "all the best", "technocredits", "", "maharashtra" };

		String maxarr = maxarray(Input);
		System.out.println(maxarr + " is the maximum array");

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