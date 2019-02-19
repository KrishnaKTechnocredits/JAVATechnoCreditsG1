package saket;

public class Stringarray {

	static String value;

	public static void main(String[] args) {

		String[] array = { "krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek" };

		String[] output = new String[6];

		for (int i = 0; i <= array.length - 1; i++)

		{

			value = array[i];

			if (value.length() >= 7)

			{

				System.out.print(value+" ");

			}

		}

	}
}