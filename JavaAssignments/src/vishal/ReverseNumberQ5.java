package vishal;

import java.util.Scanner;

public class ReverseNumberQ5 {

	public int reverseNum(int n) {

		String input = String.valueOf(n);

		String result = "";

		for (int index = input.length() - 1; index >= 0; index--) {

			result = result + input.charAt(index);

		}
		int reversedInt = Integer.parseInt(result);

		return reversedInt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User Input");
		Integer i1 = sc.nextInt();
		ReverseNumberQ5 rn = new ReverseNumberQ5();
		System.out.println("Output is " + rn.reverseNum(i1));
	}

}
