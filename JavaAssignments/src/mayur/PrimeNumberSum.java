package mayur;

public class PrimeNumberSum 
{
	public static void main(String[] args) 
	{
		int StartingNumber = Integer.parseInt(args[0]);
		int EndingNumber = Integer.parseInt(args[1]);
		int sum = 0;
		for (int i = StartingNumber; i <= EndingNumber; i++) 
		{
			boolean b = isPrime(i);
			if (b == true) 
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of all prime numbers in user given range:" + StartingNumber + " To " + EndingNumber
				+ " is =" + sum);
	}

	static boolean isPrime(int num) 
	{
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) 
		{
			if (num % i == 0) 
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
}