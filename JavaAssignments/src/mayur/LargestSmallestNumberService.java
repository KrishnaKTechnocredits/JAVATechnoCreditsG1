/*service class To find smallest and largest number of array*/
package mayur;

public class LargestSmallestNumberService {
	int[] LargestSmallest(int[] arry)
	{
		int Largest = 0;
		int Smallest = arry[0];

		for (int index = 0; index < arry.length; index++) 
		{
			if (Smallest > arry[index]) 
			{
				Smallest = arry[index];
			}
			if (Largest < arry[index]) 
			{
				Largest = arry[index];
			}
		}

		int[] temp = new int[2];
		temp[0] = Smallest;
		temp[1] = Largest;
		return temp;
	}

}
