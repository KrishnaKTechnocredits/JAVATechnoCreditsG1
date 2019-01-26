package farhin;

public class ClientCalculator {
	public static void main(String[] a) {
		int x=Integer.parseInt(a[0]);
		int y=Integer.parseInt(a[1]);
		Calculator c1=new Calculator();
		System.out.println(c1.sum(x,y));
		System.out.println(c1.subtract(x,y));
		System.out.println(c1.multiply(x,y));
		System.out.println(c1.divide(x,y));
		System.out.println(c1.remainder(x,y));
	}

}
