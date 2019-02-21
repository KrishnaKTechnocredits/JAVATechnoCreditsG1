package farhin;

import java.util.Scanner;

public class EqualityOfArray {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		EqualityOfArray equalityOfArray=new EqualityOfArray();
		int [] arrayOne = equalityOfArray.takeInputs("Enter First array", sc);
		int [] arrayTwo = equalityOfArray.takeInputs("Enter Second array", sc);
		sc.close();
		
		if(arrayOne.length!=arrayTwo.length) {
			System.out.println(" Array length is different");
			return;
		}
		Boolean isEqual = equalityOfArray.checkEquality(arrayOne, arrayTwo);
		if(isEqual) {
			System.out.println("Arrays are equal");
			return;
		}
		System.out.println("Arrays are not equal");
	}
	
	int[]  takeInputs(String str, Scanner sc)
	{
		
		System.out.println(str);
		int arraySize=sc.nextInt();
		int[] array=new int[arraySize];
		for(int index=0;index<arraySize;index++)
		{
			array[index]=sc.nextInt();
		}
		return array;
	}	
	
	Boolean checkEquality(int[] arrayOne, int[] arrayTwo) {
		Boolean isEqual = true;
		for(int index=0; index<arrayOne.length;index++) {
			if(arrayOne[index]!=arrayTwo[index]) {
			isEqual = false;
			break;
			}
		}
		return isEqual;
	}
}
