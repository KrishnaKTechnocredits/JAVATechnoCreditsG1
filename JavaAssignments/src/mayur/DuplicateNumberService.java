/*Service class to read user input and find duplicate number from array*/
package mayur;

import java.util.Scanner;

public class DuplicateNumberService 
{	
	//method to find Duplicate number from Array- User define. Returns integer value.
	int FindDuplicate(int[] arry) 
	{
		int dNo = 0;
		for (int index = 0; index < arry.length; index++) // for loop to traverse array element 
		{
			for (int index1 = 1; index1 < index; index1++) 
			{
				if (arry[index] == arry[index1])
					dNo = arry[index];
			}
		}
		return dNo;//returning duplicate number from array
	}
}
