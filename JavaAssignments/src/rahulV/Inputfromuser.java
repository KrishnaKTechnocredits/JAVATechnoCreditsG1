package rahulV;

import java.util.Scanner;

public class Inputfromuser {


	 int[] takeInputFromUserInt() {            // method to take user input element of array at runtime
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int[] num = new int[size];                 // one number is missing hence input size is 9

		for (int index = 0; index < num.length; index++) {
			num[index] = sc.nextInt();
		}
		return num;
	}

	}

