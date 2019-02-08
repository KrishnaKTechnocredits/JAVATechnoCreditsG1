// Find first differ index from given arrays 
package mayur;

public class MaxValueDifferIndex 
{
	public static void main(String[] args) 
	{
		UserInputArray userInputArray = new UserInputArray();
		int[] arr1 = userInputArray.userInput();// taking user Inputs
		int[] arr2 = userInputArray.userInput();// taking user Inputs
		MaxValueDifferIndex firstDifferIndexArray = new MaxValueDifferIndex();
		firstDifferIndexArray.maxValueDifferIndex(arr1, arr2); // calling differFirstArrayIndex()
	}

	void maxValueDifferIndex(int[] arr1, int[] arr2) 
	{
		for (int index = 0; index < arr1.length; index++) 
		{
			if (arr1[index] != arr2[index]) // comparing value of array1's and array2's index position
			{
				System.out.println("Values are not matching at index -> " + index);
				if (arr1[index] > arr2[index]) // comparing max value at differ index
					System.out.println("From (" + arr1[index] + "," + arr2[index] + ")  max value is " + arr1[index]);
				else
					System.out.println("From (" + arr1[index] + "," + arr2[index] + ")  max value is " + arr2[index]);
			}
		}
	}
}
