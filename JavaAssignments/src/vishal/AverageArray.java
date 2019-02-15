package vishal;

import java.util.Scanner;

public class AverageArray {

	public static void main(String[] args) {
		AverageArray ar = new AverageArray();
		int[] userInput = ar.userInput();
		double result = ar.avg(userInput);
		System.out.println(result);

	}

	public int[] userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] input = new int[size];

		for (int index = 0; index < size; index++) {
			System.out.println("Enter array element " + index);
			input[index] = sc.nextInt();
		}
		return input;
	}

	public double avg(int[] inputArray) {
		double sum = 0;
		for (int index = 0; index < inputArray.length; index++) {
			int value = inputArray[index];
			sum = sum + value;

		}
		double avg = sum / inputArray.length;
		return avg;
	}

}
