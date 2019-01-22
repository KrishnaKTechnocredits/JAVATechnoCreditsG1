package shwetaR;

public class ShwetaR_Assignment_Q8 {
	static int a;
	static int b;
	static void swapAtoB() {
		a=a+b;//70
		b=a+b;//110
		a=b-a;//40
		b=b-a-a;//30
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		 a = Integer.parseInt(args[0]);
		 b = Integer.parseInt(args[1]);
		swapAtoB();

	}
}
