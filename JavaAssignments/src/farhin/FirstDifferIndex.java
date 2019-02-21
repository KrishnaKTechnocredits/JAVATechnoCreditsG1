package farhin;

import java.util.Scanner;

public class FirstDifferIndex {
	public static void main(String[] args) {
		FirstDifferIndex findIndex = new FirstDifferIndex();

		Scanner sc = new Scanner(System.in);
		int[] firstArr = findIndex.takeInputs( "first", sc);
		int[] secondArr = findIndex.takeInputs("second", sc);
		sc.close();
		if (firstArr.length != secondArr.length) {    //checking array length same or not
			System.out.println("Array lengths do not match");
			return;
		}
		int differIndex = findIndex.findDifferIndex(firstArr, secondArr);
		if(differIndex<0) {                           // check differIndex value after to validate array maching
			System.out.println("Arrays are matching");
		}else {

			System.out.println("Values are not matching at index-> " + differIndex);	
		}
	}

	int[] takeInputs(String str, Scanner sc) {
		System.out.println("Enter "+str+" Array Size");
		int arrSize = sc.nextInt();
		int[] arrNum = new int[arrSize];
		System.out.println("Enter "+str+" Array ");
		for (int index = 0; index < arrSize; index++) {
			arrNum[index] = sc.nextInt();
		}
		return arrNum;
	}

	int findDifferIndex(int[] arr1, int[] arr2) {
		int differIndex = -1;
		for (int index = 0; index < arr1.length; index++) {  //iterate through both array 
			if (arr1[index] != arr2[index]) {    //check both array's index value
				differIndex = index;
				break;
			}
		}
		return differIndex;

	}
}
