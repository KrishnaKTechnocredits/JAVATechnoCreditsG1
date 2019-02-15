package vishal;

public class MaxLengthStringQ2 {

	String[] input = { "all the best", "technocredits", "", "maharashtra" };
	// int[] arr = new int[input.length];

	public int findMaxLength() {
		int max = 0;
		int count = 0;
		for (int index = 0; index < input.length; index++) {

			if (max < input[index].length()) {
				max = input[index].length();
				count = index;
			}

		}

		return count;
	}

	public static void main(String[] args)

	{
		MaxLengthStringQ2 ml = new MaxLengthStringQ2();
		// int maxIndex=ml.findMaxLength();
		System.out.println("Max length string is " + ml.input[ml.findMaxLength()]);

	}

}
