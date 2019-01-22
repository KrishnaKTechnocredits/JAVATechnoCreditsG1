package vishal;

public class PrimeNumber {

	public boolean primeNumber(int num) {

		boolean state = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				// System.out.println(num+" This is not a prime number");
				state = false;

				break;
			}
		}

		return state;
	}

	public static void main(String[] args) {
		int countNotPrime = 0;
		int countPrimeNo = 0;
		int sumPrimeNo = 0;
		PrimeNumber pn = new PrimeNumber();
		int startNo = Integer.parseInt(args[0]);
		int endNo = Integer.parseInt(args[1]);

		for (int i = startNo; i <= endNo; i++) {
			boolean state = pn.primeNumber(i);
			if (state == true) {
				System.out.println(i + " This is a prime no.");
				countPrimeNo = countPrimeNo + 1;
				sumPrimeNo = i + sumPrimeNo;
			} else {
				System.out.println(i + " This is not a prime no.");
				countNotPrime = countNotPrime + 1;
				

			}
		}
		System.out.println("Total Prime No. " + countPrimeNo);
		System.out.println("Total non prime No." + countNotPrime);
		System.out.println("Sum of prime nos " + sumPrimeNo);

	}

}
