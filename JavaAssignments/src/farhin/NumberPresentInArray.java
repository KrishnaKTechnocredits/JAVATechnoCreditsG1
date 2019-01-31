package farhin;

import java.util.Scanner;

public class NumberPresentInArray {
	static int findNum;

	int[] takeInputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int arrSize = sc.nextInt();
		int[] arrNum = new int[arrSize];
		for (int index = 0; index < arrSize; index++) { // to take entered numbers in array
			arrNum[index] = sc.nextInt();
		}
		System.out.println("Find number in array");
		findNum = sc.nextInt();
		sc.close();
		return arrNum;
	}

	boolean arrayContainsNum(int[] arrNum, int findNum) {
		boolean isNumFind = false;
		for (int index = 0; index < arrNum.length; index++) { //iterate array to find number contains or not
			if (arrNum[index] == findNum) {
				isNumFind = true;
			}
		}

		return isNumFind;
	}

	public static void main(String[] args) {
		NumberPresentInArray numberPresentInArray = new NumberPresentInArray();
		int[] arrNum = numberPresentInArray.takeInputs();
		boolean isNumFind = numberPresentInArray.arrayContainsNum(arrNum, findNum);
		if (isNumFind == true)
			System.out.println(findNum + " is in array");
		else
			System.out.println(findNum + " is not in array");

	}

}
