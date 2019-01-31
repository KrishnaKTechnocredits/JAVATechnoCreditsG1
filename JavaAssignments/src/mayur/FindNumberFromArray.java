package mayur;

import java.util.Scanner;

public class FindNumberFromArray {

	public static void main(String[] args) 
	{
		FindNumberFromArrayService findNumberFromArrayService = new FindNumberFromArrayService();
		int[] arry = findNumberFromArrayService.UserInput();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To search in array");
		int fNo = sc.nextInt();
		if (findNumberFromArrayService.FindNumber(arry, fNo) == false) 
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