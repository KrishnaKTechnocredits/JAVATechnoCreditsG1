package abhishek;

public class sumofprimenum {
	static int sum;

	static boolean isPrime(int num) {
		boolean flag = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}
	
	static void sumofprime(int start,int end) {
		for (int i = start; i <= end; i++) {
			boolean f = isPrime(i);
			if (f == true) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("sum is " + sum);
	}
	
		
		
	

	public static void main(String[] args) {
		
		sumofprime(0,10);
}}
