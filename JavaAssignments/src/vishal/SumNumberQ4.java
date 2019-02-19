package vishal;

import java.util.Scanner;

public class SumNumberQ4 {

	// String s;
	// char[] ch;
	// int[] arr=new int[s.length()];

	public int sum() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("User Input");
		Integer i1 = sc.nextInt();

		String s = i1.toString();
		char[] ch = s.toCharArray();
		// int[] arr=new int[s.length()];
		for (int index = 0; index < s.length(); index++) {
			int num = Integer.parseInt(String.valueOf(ch[index]));//Here I am converting char to string then paring it to integer
			sum = sum + num;
		}

		return sum;

	}

	public static void main(String[] args) {
		SumNumberQ4 sn = new SumNumberQ4();
		System.out.println("Sum of digits are "+sn.sum());;

	}

}
