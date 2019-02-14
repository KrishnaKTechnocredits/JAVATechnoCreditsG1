/*-----------------------------------------------------------------------
Assignment: WAP to find Fibonacci series for user defined number
 -----------------------------------------------------------------------*/


package shraddha;

import java.util.Scanner;

public class FibonnacciSeries {

	void fibonnaci_series() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no of fibonnacci series:= ");
		int first_no = sc.nextInt();
		System.out.println("Enter second no of fibonnacci series:= ");
		int second_no = sc.nextInt();
		System.out.println("Enter length of series:= ");
		int series_length = sc.nextInt();

		int count = 2;
		int third_no = 0;

		System.out.print("Fibonnacci Series is: ");
		System.out.print(first_no+" ");
		System.out.print(second_no+" ");
		do {
			third_no = first_no + second_no;
			first_no = second_no;
			second_no = third_no;
			count++;
			System.out.print(third_no + " ");
		}while(count <= series_length);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonnacciSeries f = new FibonnacciSeries();
		f.fibonnaci_series();

	}

}
