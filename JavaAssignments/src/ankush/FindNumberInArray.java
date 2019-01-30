package ankush;

// Program to check if array contains a number in Java
import java.util.Scanner;

public class FindNumberInArray {
	Scanner sc = new Scanner(System.in);

	void checkNumberExists(int[] inputArray) {
		int nCount = 0;
		System.out.println("Enter Number to search in an Array");
		int numbToFind = sc.nextInt();

		/*
		 * Loop to check if entered Number is matching with array element then
		 * increase count
		 */
		for (int index = 0; index < inputArray.length; index++) {
			if (numbToFind == inputArray[index]) {
				nCount++;
			}
		}
		/* If count =0 then number is not present in Array */

		if (nCount == 0) {
			System.out.println("Number is not in Array");
		} else {
			System.out.println("Number is present in an Array");
		}
	}

	public static void main(String[] args) {
		InputOperations inputOperations = new InputOperations();
		int[] inputArray = inputOperations.takeInputsFromUser();
		FindNumberInArray findNumberInArray = new FindNumberInArray();
		findNumberInArray.checkNumberExists(inputArray);
	}
}
