package vishal;

import java.util.Scanner;

public class VisibleTrees {

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

	int visibleTreecount(int[] numbers) {
		int max = 0;
		int treeCount = 0;

		for (int index = 0; index < numbers.length; index++) { //This for loop to find max length of tree and if length is max than previous tree then increase visible tree count 
			if (max < numbers[index]) {
				max = numbers[index];
				treeCount = treeCount + 1;

			}
		}

		return treeCount;

	}

	public static void main(String[] args) {
		VisibleTrees vt = new VisibleTrees();
		int[] userInput = vt.enterDataInt();
		int visibleTreeCount = vt.visibleTreecount(userInput);
		System.out.println("Visible Trees are " + visibleTreeCount);

	}

}
