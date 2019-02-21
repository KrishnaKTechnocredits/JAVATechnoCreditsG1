package farhin;

import java.util.Scanner;

public class DuplicateNum {
	static int duplicate= 0;
	public static void main(String[] args) {
		DuplicateNum duplicateNum = new DuplicateNum();
		int[] arrNum = duplicateNum.takeInputs();
		boolean isDuplicate=duplicateNum.findDuplicateNum(arrNum);
		if(isDuplicate==true)
		{
			System.out.println("Duplicate number is: "+duplicate);
		}
		else
		{
			System.out.println("There is no duplicate number");
		}
	}

	int[] takeInputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int arrSize = sc.nextInt();
		int[] arrNum = new int[arrSize];
		for (int index = 0; index < arrSize; index++) // Taking numbers in array
		{
			arrNum[index] = sc.nextInt();

		}
		sc.close();
		return arrNum;
	}

	boolean findDuplicateNum(int[] arrNum) {
		boolean isDuplicate = false;
		int index;
		for (index = 0; index < arrNum.length - 1; index++) // iterate through array
		{
			for (int count = index + 1; count < arrNum.length; count++) // iterate through index+1 to check for
																		// duplicate
			{
				if (arrNum[index] == arrNum[count]) {
					duplicate = arrNum[index];
					isDuplicate=true;
					break;
				}
				
			}

		}
	       
		return isDuplicate;
	}

}
