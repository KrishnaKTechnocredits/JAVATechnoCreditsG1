package farhin;

public class SumOfPrimeNo {
	static int sum = 0;

	public static void main(String[] args) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		for (int i = start; i <= end; i++) {
			boolean f = isPrime(i);
			if (f == true) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			} 
		}
		return true;

	}

}
