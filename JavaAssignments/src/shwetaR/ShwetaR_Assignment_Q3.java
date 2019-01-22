package shwetaR;

public class ShwetaR_Assignment_Q3
{

	static void square(int a) {
		int x = a * a;
		System.out.println(x);
	}

	static void cube(int a) {
		int x = a * a * a;
		System.out.println(x);
	}

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		square(a);
		cube(a);

	}
}
