package saket;

public class sumofusergivennumber {

	public static void main(String[] args) {
		int sum = 0;
		int input = 159753;

		String input1 = Integer.toString(159753);

		for (int i = 0; i <= input1.length() - 1; i++) {

			sum = sum + Character.getNumericValue(input1.charAt(i));
		}
		System.out.println("SUM OF THE GIVEN NUMBER IS " + sum);
	}

}
