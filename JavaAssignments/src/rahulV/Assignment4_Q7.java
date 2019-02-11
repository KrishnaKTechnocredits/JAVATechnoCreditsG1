package rahulV;

import java.util.Scanner;

//WAP to find factorial for user defined number

public class Assignment4_Q7 {

	void factorial(int num) {
		int ans = 1;
		while (num > 0) {
			ans = ans * num;
			num--;
		}
		System.out.println("Factorial of user defined number is "+ans);
	}

	public static void main(String[] args) {
		System.out.println("Enter an integer to find factorial");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Assignment4_Q7 fn = new Assignment4_Q7();
		fn.factorial(num);

	}

}
