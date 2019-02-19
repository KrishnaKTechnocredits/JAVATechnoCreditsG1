package saket;

public class FibonassiSeries {

	public static void main(String[] args) {

		int inputnum = 5;
		int factorial = 5;

		for (int i = 1; i < inputnum; i++) {

			factorial = factorial * (inputnum - i);

		}
		System.out.println(factorial);

		// 1*2*3*4*5
		// n*(n+1)*(n+2)*(n+3)*(n+4)
		// 1*2

	}

}
