package farhin;

public class SwapWithoutVar {
	public static void main(String[] a) {
		int x = Integer.parseInt(a[0]);
		int y = Integer.parseInt(a[1]);
		SwapWithoutVar.swap(x, y);

	}

	public static void swap(int a, int b) {
		System.out.println("Before swapping a=" + a + " and b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping a=" + a + " and b=" + b);
	}

}
