//Check if array contains a number
package mayur;

import java.util.Scanner;

public class FindNumberFromArray {

	public static void main(String[] args) 
	{
		FindNumberFromArrayService findNumberFromArrayService = new FindNumberFromArrayService();
		int[] arry = findNumberFromArrayService.userInput();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To search in array");
		int fNo = sc.nextInt();
		if (findNumberFromArrayService.findNumber(arry, fNo) == false) 
		{
			System.out.println("Number is not in arr. ");
		} 
		else 
		{
			System.out.println("Number found in array");
		}
		sc.close();
	}

}