package saket;

public class Program3 {

	public static void main(String[] args)

	{

		char first = 'e';

		String user = "electrical engineering";
		int count = 0;

		for (int i = 0; i <= user.length() - 1; i++)

		{

			if (user.charAt(i) == first) {

				count++;
			}

		}
		System.out.println(count);

	}
}
