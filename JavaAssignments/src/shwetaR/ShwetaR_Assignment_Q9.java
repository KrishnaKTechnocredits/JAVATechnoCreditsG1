package shwetaR;

public class ShwetaR_Assignment_Q9 {

	static void swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		swap(a, b);
	}

}
