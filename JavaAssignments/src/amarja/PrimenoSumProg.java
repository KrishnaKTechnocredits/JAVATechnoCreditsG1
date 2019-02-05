package amarja;
//program to find sum of prime numbers between given user range
public class PrimenoSumProg {
	static int sum=0;
	public static void main(String[] args) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		System.out.println("User range provided is "+start+" to "+end);
		System.out.println("The Prime numbers are : ");
		for (int i = start; i <= end; i++) {
			boolean flag = primeCheck(i);
			if (flag == true)
			{
				System.out.println(i);
				sum=sum+i;
			}	
					}
			System.out.println("The sum of Prime numbers is " + sum);
	}
	static boolean primeCheck(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
