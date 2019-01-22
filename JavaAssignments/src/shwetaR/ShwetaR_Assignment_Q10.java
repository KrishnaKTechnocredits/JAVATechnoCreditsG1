package shwetaR;

public class ShwetaR_Assignment_Q10 {
	static int sum = 0;

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

	public static void main(String[] args) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		
		for(int i=start; i<=end;i++)
		{
			boolean f= isPrime(i);
			if(f==true)
			{
				sum=sum+i;
			}
		}
		System.out.println("sum is"+" "+ sum);
	}
}
