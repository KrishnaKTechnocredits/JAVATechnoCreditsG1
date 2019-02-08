// all pairs on integer array whose sum is equal to given number
package mayur;

import java.util.Scanner;

public class ArraySumNumber {
	public static void main(String[] args) {
		UserInputArray userInputArray = new UserInputArray();
		int[] array = userInputArray.userInput();// taking user input in Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find sum of pair of element from array:");
		int num = sc.nextInt();
		ArraySumNumber arraySumNumber = new ArraySumNumber();
		arraySumNumber.arraySumNumber(array, num); // calling arraySumNumber()
		sc.close();
	}

	void arraySumNumber(int[] array, int num) {
		for (int index = 0; index < array.length; index++) 
		{
			for (int index2 = 0; index2 < index; index2++) 
			{
				if (array[index] + array[index2] == num) // comparing addition of n and n+1 with Number
				{
					System.out.println("Integer numbers, whose sum is equal to value:" + num + "\n(" + array[index]
							+ "," + array[index2] + ")");
				}
			}

		}
	}
}
