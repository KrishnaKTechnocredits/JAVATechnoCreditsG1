package saket;

public class ArmStrong {

	public static void main(String[] args) {

		int input1 = 153;
		int input2 = 234;

		ArmStrong(input1);
		ArmStrong(input2);
	}

	static void ArmStrong(int input) {
		int output = 0;
		int num1 = 0;

		output = input % 10;
		int num = output * output * output;
		num1 = num1 + num;

		String input1 = Integer.toString(153);

		String input2 = input1.substring(0, 2);

		int input3 = Integer.parseInt(input2);

		output = input3 % 10;

		num = output * output * output;
		num1 = num1 + num;

		char a = input1.charAt(0);
		int input4 = Character.getNumericValue(a);
		output = input4 % 10;

		num = output * output * output;

		num1 = num1 + num;

		System.out.println(num1);

		if (num1 == input)

		{
			System.out.println("Given num is a Armstrong");
		} else {

			System.out.println("Given num is not a Armstrong");

		}

	}
}