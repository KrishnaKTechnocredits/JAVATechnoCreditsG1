/*Service class of find number from user given array
*/
package mayur;

import java.util.Scanner;

public class FindNumberFromArrayService {

	int[] UserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array:");
		int size = sc.nextInt();
		int[] Arry = new int[size];
		System.out.println("Enter " + size + " numbers");
		for (int index = 0; index < size; index++) // for loop to store console input in array.
		{
			Arry[index] = sc.nextInt();
		}
		return Arry;
	}

	boolean FindNumber(int[] arry, int fno) {
		boolean flag = false;
		for (int index = 0; index < arry.length; index++) 
		{
			if (arry[index] == fno) //comparing user given number with array elements
			{
				flag = true;
			}
		}
		return flag;
	}
}
