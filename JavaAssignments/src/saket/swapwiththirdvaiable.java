package saket;

public class swapwiththirdvaiable {

	int swap(int a, int b) {
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		return 0;
	};

	public static void main(String[] args) {
		swapwiththirdvaiable A = new swapwiththirdvaiable();
		A.swap(5, 10);

		// TODO Auto-generated method stub
	}

}
