package ankush;

import java.util.Scanner;

public class FibonacciSeries {

	int calFibonacci(int input) {
		int numb = input;
		while (input > 1) {
			numb = numb * (input - 1);
			input = input - 1;
		}
		return numb;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to calculate Fibonacci Series :");
		int number = sc.nextInt();
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		int output = fibonacciSeries.calFibonacci(number);
		System.out.println("Fibonacci Series of " + number + " : " + output);
		sc.close();
	}
}
