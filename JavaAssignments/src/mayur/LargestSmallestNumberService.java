/*service class To find smallest and largest number of array*/
package mayur;

public class LargestSmallestNumberService {
	int[] largestSmallest(int[] arry)
	{
		int largest = 0;
		int smallest = arry[0];

		for (int index = 0; index < arry.length; index++) 
		{
			if (smallest > arry[index]) 
			{
				smallest = arry[index];
			}
			if (largest < arry[index]) 
			{
				largest = arry[index];
			}
		}

		int[] temp = new int[2];
		temp[0] = smallest;
		temp[1] = largest;
		return temp;
	}

}
