package farhin;

import java.util.Scanner;

public class PairsOfNumbers {

	public static void main(String[] args) {
		PairsOfNumbers pairsOfNum = new PairsOfNumbers();
		int[] arrNum = pairsOfNum.takeInputs();
		Boolean hasPairs = pairsOfNum.findPairsOfNums(arrNum);
		if (!hasPairs) {
			System.out.println("Array has no pairs");
		}
	}

	int[] takeInputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int arrSize = sc.nextInt();
		int[] arrNum = new int[arrSize + 1];
		int index = 0;
		for (index = 0; index < arrNum.length - 1; index++) // taking numbers in array
		{
			arrNum[index] = sc.nextInt();
		}
		System.out.println("Enter the number to find pairs of sum from array");
		arrNum[index] = sc.nextInt();
		sc.close();
		return arrNum;
	}

	Boolean findPairsOfNums(int[] arrNum) {
		Boolean hasPairs = false;
		int index = 0, count = 0;
		for (index = 0; index < arrNum.length - 2; index++) //
		{
			for (count = index + 1; count < arrNum.length - 1; count++) {
				if (arrNum[index] + arrNum[count] == arrNum[arrNum.length - 1]) {
					hasPairs = true;
					System.out.println("Integer numbers, whose sum is equal to value:" + arrNum[arrNum.length - 1]
							+ " are (" + (arrNum[index]) + "," + (arrNum[count]) + ")");
				}
			}
		}

		return hasPairs;
	}
}
