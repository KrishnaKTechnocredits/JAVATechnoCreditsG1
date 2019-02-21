package farhin;

import java.util.Scanner;

public class MaxAtDifferIndex {
	public static void main(String[] args) {
		FirstDifferIndex inputs = new FirstDifferIndex();
		Scanner sc = new Scanner(System.in);
		int[] firstArr = inputs.takeInputs("first", sc);
		int[] secondArr = inputs.takeInputs("second", sc);
		sc.close();
		MaxAtDifferIndex maxValue = new MaxAtDifferIndex();
		if (firstArr.length != secondArr.length) {
			System.out.println("Array length do not matching");
			return;
		}
		maxValue.findMaxAtDifferIndex(firstArr, secondArr);
	}

	void findMaxAtDifferIndex(int[] arr1, int[] arr2) {
		int maxValue = 0;
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index])   //check differ index
			{
				System.out.println("Values are not matching at index -> " + index);
				if (arr1[index] > arr2[index])   //check max value of differ index
				{
					maxValue = arr1[index];
				} else {
					maxValue = arr2[index];
				}
				System.out.println("from (" + arr1[index] + "," + arr2[index] + ") max value is " + maxValue);
				break;
			}
			
			
		}

	}

}
