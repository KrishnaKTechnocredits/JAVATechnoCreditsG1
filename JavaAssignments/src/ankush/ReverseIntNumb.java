package ankush;

public class ReverseIntNumb {

	void reverseIntNumb(int input) {
		String sum = "";

		while (input % 10 != 0) {
			sum = sum + "" + (input % 10);
			input = (input / 10);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int input = 159753;
		ReverseIntNumb reverseIntNumb = new ReverseIntNumb();
		reverseIntNumb.reverseIntNumb(input);

	}
}
