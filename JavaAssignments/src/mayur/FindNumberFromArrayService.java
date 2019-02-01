/*Service class of find number from user given array
*/
package mayur;

import java.util.Scanner;

public class FindNumberFromArrayService 
{
	int[] userInput() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array:");
		int size = sc.nextInt();
		int[] arry = new int[size];
		System.out.println("Enter " + size + " numbers");
		for (int index = 0; index < size; index++) // for loop to store console input in array.
		{
			arry[index] = sc.nextInt();
		}
		sc.close();
		return arry;

	}

	boolean findNumber(int[] arry, int fno) 
	{
		boolean flag = false;
		for (int index = 0; index < arry.length; index++) 
		{
			if (arry[index] == fno) // comparing user given number with array elements
			{
				flag = true;
			}
		}
		return flag;
	}
}
