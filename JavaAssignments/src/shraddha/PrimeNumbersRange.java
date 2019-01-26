//-------------------------------------------------------------
//Assignment: Sum of prime numbers in a given range of numbers.
//-------------------------------------------------------------

package shraddha;

public class PrimeNumbersRange {

	static int prime_sum = 0;

	int PrimeNumbers(int number) {
		boolean flag = false;

		for (int i = 2; i <= number/2; i++) {
			if (number%i == 0) {
				flag = true;
				System.out.println("Not Prime" + number);
				break;
			}

		}

		if (flag == false) {
			System.out.println("Prime number" + number);
			prime_sum = prime_sum + number;

		}
		
		return prime_sum;
	}

	// Prime Nos Sum
	void display(int prime_sum)
	{
		System.out.println(prime_sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbersRange pm = new PrimeNumbersRange();
		int i=0,prime_sum=0;
		for (i = Integer.parseInt(args[0]); i <= Integer.parseInt(args[1]); i++) {
			prime_sum = pm.PrimeNumbers(i);
			
		}
		
		pm.display(prime_sum);
	}

}
