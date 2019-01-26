package farhin;

public class SwapUsingVar {

	public static void main(String[] a) {
		int x = Integer.parseInt(a[0]);
		int y = Integer.parseInt(a[1]);
		System.out.println("Swap this numbers: " + a[0] + " and " + a[1]);
		SwapUsingVar s1 = new SwapUsingVar();
		s1.swapNos(x, y);

	}

	public void swapNos(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping :" + "a=" + a + " and b=" + b);
	}

}
