package vishal;

public class StringLengthQ15 {

	public static void main(String[] args) {
		String[] input = { "krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek" };
		StringLengthQ15 sl = new StringLengthQ15();
		sl.checkLength(input);

	}

	public void checkLength(String[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() >= 7) {
				System.out.println(input[index]);
			}
		}
	}

}
