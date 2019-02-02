package saket;

public class EqualArray {
	static int temp = 0;

	public static void main(String[] args) {

		int[] a = { 21, 57, 11, 37, 24 };
		int[] b = { 21, 57, 11, 37, 24 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				temp = 1;
			}
		}
		display();
	}

	static void display() {
		if (temp == 1) {
			System.out.println("All the given arrays are not same");
		} else {
			System.out.println("All the given arrays are not same");
		}
	}

}
