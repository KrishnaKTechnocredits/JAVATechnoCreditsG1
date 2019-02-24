package vishal;

public class Exception_Q2 {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		Exception_Q2 q2 = new Exception_Q2();
		q2.displayArray(a1);

	}

	public void displayArray(int[] input) {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(input[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			System.out.println("Please check array size: Array out of bound exception occurred");
		}
	}
}