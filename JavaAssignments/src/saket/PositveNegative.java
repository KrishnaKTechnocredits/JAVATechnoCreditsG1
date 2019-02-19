package saket;

public class PositveNegative {

	public static void main(String[] args) {

		int[] a = { 5, 6, -9, 14, -25, 6, 7, -14 };

		PositveNegative pn = new PositveNegative();
		pn.positivnegativeearray(a);

	}

	void positivnegativeearray(int[] a) {
		int psum = 0;
		int nsum = 0;
		int j = 0;
		int k = 0;
		int positive[] = new int[6];
		int negative[] = new int[5];

		for (int i = 0; i < a.length; i++)

		{
			if (a[i] > 0) {

				positive[j] = a[i];

				System.out.print(positive[j] + " ");

				psum = psum + a[i];
				j++;
				;

			}
		}
		System.out.println();

		for (int m = 0; m < a.length; m++) {
			if (a[m] < 0) {

				negative[k] = a[m];
				System.out.print(negative[k] + " ");
				nsum = nsum + a[m];
				k++;

			}
		}
		System.out.println();
		System.out.println(psum);
		System.out.println(nsum);

	}

}
