package vishal;

import java.util.Scanner;

public class UserInput {
	
	int[] enterDataInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of input: ");
		int size = sc.nextInt();

		int[] numbers = new int[size];

		for (int index = 0; index < size; index++) { //This loop is to enter values
			System.out.println("value at position " + index+":");
			numbers[index] = sc.nextInt();

		}

		return numbers;
	}

}
