package rahulV;

public class PrimeNumbers {
	public static void main(String[] a) {
		int sum = 0;
		int num1 = Integer.parseInt(a[0]);
		int num2 = Integer.parseInt(a[1]);
		for (int i = num1; i <= num2; i++) {
			boolean flag = isPrime(i);
			if (flag == true) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of Prime Numbers between give range is : " + sum);

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
