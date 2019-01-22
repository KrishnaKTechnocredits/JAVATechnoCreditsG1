package ankush;

public class PrimeNumberSum {
	public static void main(String[] a) {
		int sum = 0;
		int start = Integer.parseInt(a[0]);
		int end = Integer.parseInt(a[1]);
		for (int i = start; i <= end; i++) {
			boolean flag = isPrime(i);
			if (flag == true) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of Prime Number is : " + sum);

	}

	static boolean isPrime(int number) {
		boolean flag = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
