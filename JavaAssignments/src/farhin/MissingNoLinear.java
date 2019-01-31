package farhin;

import java.util.Scanner;

public class MissingNoLinear {

	int[] takeInputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int arrSize = sc.nextInt();
		int[] arrNum = new int[arrSize];
		for (int index = 0; index < arrSize-1; index++) // Taking numbers in array
		{
			arrNum[index] = sc.nextInt();
			
		}
		sc.close();
		return arrNum;
	}

	int calcActualSum(int[] numArr) {
		int actualSum = 0;
		for (int index = 0; index < numArr.length; index++)  //to calculate actual sum of array
		{
			actualSum = actualSum + numArr[index];
		}
		
		return actualSum;
	}

	int missingNum(int actualSum) {
		int expectedSum = 55;
		return (expectedSum-actualSum);
	}

	public static void main(String[] args) {
		MissingNoLinear mNum = new MissingNoLinear();
		int[] arrNum = mNum.takeInputs();
		int actualSum = mNum.calcActualSum(arrNum);
		System.out.println("Missing number from 1 to 10 is: "+mNum.missingNum(actualSum));

	}

}
