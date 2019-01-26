package saket;

public class Primenumber {

	// static boolean flag = true;

	public static void main(String[] a) {

		int startnum = Integer.parseInt(a[0]);
		int Endnum = Integer.parseInt(a[1]);
		int sum = 0;
		for (int i = startnum; i <= Endnum; i++) {
			boolean b = prime(i);
			if (b == true) {
				System.out.println("Prime number between " + startnum + " to " + Endnum + " " + i);
				sum = sum + i;
			}
		}
		System.out.println(sum);

	}

	static boolean prime(int num) {
		boolean flag = true;

		{
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0)
					flag = false;
				return flag;

			}

			return flag;

		}
	}
}
